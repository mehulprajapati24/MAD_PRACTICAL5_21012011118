    package com.example.mad_practical5_21012011118

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val browseBtn: Button = findViewById(R.id.browseButton)
        val browseEditTxt: EditText = findViewById(R.id.browseEditText)

        browseBtn.setOnClickListener {
            openBrowser(browseEditTxt.text.toString())
        }
    }

    fun openBrowser(url: String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }
    }

    fun openCall(num: String)
    {

    }

    fun openCallLog()
    {

    }

    fun openGallery()
    {

    }

    fun openCamera()
    {

    }

    fun openAlarm()
    {

    }
}