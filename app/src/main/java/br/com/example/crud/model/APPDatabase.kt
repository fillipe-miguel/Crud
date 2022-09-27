package br.com.example.crud.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import br.com.example.crud.Constants

class APPDatabase(context: Context) : SQLiteOpenHelper(
	context, Constants.DATABASE_NAME, null,
	Constants.DATABASE_VERSION
) {

	override fun onCreate(p0: SQLiteDatabase?) {
		if (p0 != null) {
			val sql =
				"CREATE TABLE users(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, " +
						"email TEXT, password TEXT, isActive INTEGER)"
			p0.execSQL(sql)
		}
	}

	override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

	}


}