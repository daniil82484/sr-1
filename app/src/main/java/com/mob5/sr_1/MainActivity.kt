package com.mob5.sr_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    lateinit var email:EditText
    lateinit var pass:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextEmail)
        pass = findViewById(R.id.editTextPassword)
    }

    val pattern = ("[a-zA-Z1-8]{1,100}" + "@" + "[A-Z]{1,9}"+ "\\." + "[a-z]{1,3}")
    fun emailValidator(text: String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun login(view: View){
        if (pass.text.toString() == "4562" && emailValidator(email.text.toString())){
            val  intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
        else if (email.text.toString() == "" && pass.text.toString() == ""){
            Toast.makeText(this, "Не работает", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "Ошибка", Toast.LENGTH_SHORT).show()
        }
    }
}