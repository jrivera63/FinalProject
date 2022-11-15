package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<TextView>(R.id.idUsernameInput)
        val password = findViewById<TextView>(R.id.idPasswordInput)
        val passwordConfirm = findViewById<TextView>(R.id.idPasswordInput2)
        val accountButton = findViewById<Button>(R.id.idAccountBtn)

        accountButton.setOnClickListener{
            if (password.text.toString() != passwordConfirm.text.toString()){
                Toast.makeText(applicationContext, getString(R.string.passwordError), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Account Created", Toast.LENGTH_LONG).show()
                val intent = Intent(this,CharacterCreation::class.java)
                startActivity(intent)
            }
        }

    }
}