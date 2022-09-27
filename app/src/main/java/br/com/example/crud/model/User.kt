package br.com.example.crud.model

data class User constructor(
	val name: String,
	val email: String,
	val password: String,
	val isActive: Boolean
) {
	constructor(
		id: Long? = null,
		name: String,
		email: String,
		password: String,
		isActive: Boolean
	) : this(name, email, password, isActive)
}

