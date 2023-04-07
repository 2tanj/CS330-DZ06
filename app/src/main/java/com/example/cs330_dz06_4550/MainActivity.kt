package com.example.cs330_dz06_4550

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(
                baseContext,
                "PORTRAIT",
                Toast.LENGTH_LONG
            ).show()
        }
        else if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(
                baseContext,
                "LANDSCAPE",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    fun showUniName(view: View) {
        Toast.makeText(
            baseContext,
            "Fakultet Informacionih Tehnologija",
            Toast.LENGTH_LONG
        ).show()
    }
    fun showUniAdress(view: View) {
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse("geo:44.8303084,20.4487139")
        i.setPackage("com.google.android.apps.maps")

        startActivity(i)
    }
    fun zadatak2(view: View) {
        val i = Intent(this, MainActivity2::class.java)
        startActivity(i)
    }
}