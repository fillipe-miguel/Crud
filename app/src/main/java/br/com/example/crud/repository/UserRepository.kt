package br.com.example.crud.repository

import br.com.example.crud.model.User

class UserRepository {

    companion object{
        private val db = mutableListOf<User>()

        fun addUser(user: User){
            db.add(user)
        }

        fun showUser(user: User): String{
           return db[db.indexOf(user)].toString()
        }

        fun showAll(): MutableList<User> {
            return db
        }
    }
}