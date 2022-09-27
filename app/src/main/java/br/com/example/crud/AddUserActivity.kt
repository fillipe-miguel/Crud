package br.com.example.crud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import br.com.example.crud.databinding.ActivityAddUserBinding
import br.com.example.crud.model.User
import br.com.example.crud.repository.UserRepository


class AddUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            view ->
            val name = binding.edtName.text.toString()
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassWord.text.toString()
            val isActivity = binding.swIsActive.isChecked

            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()){
                val user = User(name, email, password, isActivity)

                if(UserRepository.addUser(user)){
                    Toast.makeText(baseContext, getString(R.string.addUserSuccess), Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(baseContext, getString(R.string.error_addUser), Toast.LENGTH_SHORT).show()
                }


            }else Toast.makeText(baseContext, getString(R.string.error_addAll), Toast.LENGTH_SHORT).show()
        }
    }
}