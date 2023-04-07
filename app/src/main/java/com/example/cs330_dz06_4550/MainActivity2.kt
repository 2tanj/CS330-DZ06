package com.example.cs330_dz06_4550

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class MainActivity2 : AppCompatActivity() {

    var izabranFaks: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val toolbar = findViewById<Toolbar>(R.id.toolBar)
        setSupportActionBar(toolbar)
    }

    fun onClickYes(view: View) {
        var text: String = "Vi ste student "

        when (izabranFaks) {
            0 -> text += "fakulteta informacionih tehnologija"
            1 -> text += "fakulteta digitalnih umetnosti"
            2 -> text += "fakulteta za menadzment"
        }

        changeText(text)
    }
    fun onClickNo(view: View) {
        var text: String = "Vi niste student "

        when (izabranFaks) {
            0 -> text += "fakulteta informacionih tehnologija"
            1 -> text += "fakulteta digitalnih umetnosti"
            2 -> text += "fakulteta za menadzment"
        }

        changeText(text)
    }

    fun changeText(text: String) {
        val txt = findViewById<TextView>(R.id.txt)
        txt.text = text
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.fit, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.fit -> izabranFaks = 0
            R.id.fdu -> izabranFaks = 1
            R.id.fam -> izabranFaks = 2
        }

        Toast.makeText(
            baseContext,
            "Fakultet izabran!",
            Toast.LENGTH_SHORT
        ).show()

        return true
    }
}