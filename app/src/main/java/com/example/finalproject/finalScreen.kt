package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView

class finalScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_screen)

        val extras = intent.extras

        if (extras != null){
            val charName = extras.getString("charName")
            val charClass = extras.getString("charClass")
            val charRace = extras.getString("charRace")
            val warrior = extras.getBoolean("warrior")
            val mage = extras.getBoolean("mage")
            val ranger = extras.getBoolean("ranger")
            val assassin = extras.getBoolean("assassin")

            val image = findViewById<ImageView>(R.id.idImage)
            val scenario = findViewById<TextView>(R.id.scenarioText)
            val showName = findViewById<TextView>(R.id.idShowName)
            val showClass = findViewById<TextView>(R.id.idShowClass)

            if (warrior){
                showClass.text = "Warrior"
            } else if (mage){
                showClass.text = "Mage"
            } else if (ranger){
                showClass.text = "Ranger"
            } else if (assassin){
                showClass.text = "Assassin"
            }

            when (charRace){
                "Orcish" -> image.setImageResource(R.drawable.orc)
                "Elven" -> image.setImageResource(R.drawable.elf)
                "Human" -> image.setImageResource(R.drawable.human)
                "Dwarven" -> image.setImageResource(R.drawable.dwarf)
            }

            showName.text = charName
            scenario.text = "$charName, the $charRace ${showClass.text}, wakes up in a prison cell. You must have amnesia, for you don't remember much that has happened."
        }


    }
}