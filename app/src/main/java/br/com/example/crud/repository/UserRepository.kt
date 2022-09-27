package br.com.example.crud.repository

import br.com.example.crud.model.User

class UserRepository {

    companion object{
        private val db = mutableListOf<User>()

        fun addUser(user: User): Boolean{
            val filtered = db.filter { it.email == user.email }
            return if(filtered.isNotEmpty()){
                false
            }else {
                db.add(user)
                true
            }

        }

        fun showUser(user: User): String{
           return db[db.indexOf(user)].toString()
        }

        fun showAll(): MutableList<User> {
            return db
        }
    }
}