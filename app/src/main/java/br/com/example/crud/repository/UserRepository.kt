package br.com.example.crud.repository

import android.content.ContentValues
import android.content.Context
import br.com.example.crud.model.APPDatabase
import br.com.example.crud.model.User

class UserRepository(context: Context) {
    private val db = APPDatabase(context).readableDatabase

    fun addUser(user: User): Long {
        val content = ContentValues()
        content.put("name", user.name)
        content.put("email", user.email)
        content.put("password", user.password)
        content.put("isActive", user.isActive)

        return db.insert("users", null, content)
    }

    fun updateUser(userId: Int, newUser: User){
        val content = ContentValues()
        content.put("name", newUser.name)
        content.put("email", newUser.email)
        content.put("password", newUser.password)
        content.put("isActive", newUser.isActive)


        db.update("users", content, userId.toString(), )
    }

    fun deleteUser(userId: Int){

    }
}