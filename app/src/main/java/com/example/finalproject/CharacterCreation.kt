package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.Group

class CharacterCreation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_creation)

        val charName = findViewById<EditText>(R.id.idCharName)
        val charRace = findViewById<Spinner>(R.id.idRaceSpinner)
        val charClass = findViewById<RadioGroup>(R.id.classGroup)
        val begin = findViewById<Button>(R.id.btnAdventure)
        val warrior = findViewById<RadioButton>(R.id.idWarrior)
        val mage = findViewById<RadioButton>(R.id.idMage)
        val assassin = findViewById<RadioButton>(R.id.idAssassin)
        val ranger = findViewById<RadioButton>(R.id.idRanger)

        begin.setOnClickListener{
            val intent = Intent(this,finalScreen::class.java)
            intent.putExtra("warrior", warrior.isChecked)
            intent.putExtra("mage", mage.isChecked)
            intent.putExtra("assassin", assassin.isChecked)
            intent.putExtra("ranger", ranger.isChecked)
            intent.putExtra("charName", charName.text.toString())
            intent.putExtra("charRace", charRace.selectedItem.toString())
            intent.putExtra("charClass", charClass.checkedRadioButtonId)
            startActivity(intent)
        }
    }
}