    package com.example.mad_practical5_21012011118

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val browseBtn: Button = findViewById(R.id.browseButton)
        val browseEditTxt: EditText = findViewById(R.id.browseEditText)

        browseBtn.setOnClickListener {
            openBrowser(browseEditTxt.text.toString())
        }

        val openCallBtn:Button = findViewById(R.id.openCallButton)
        val openCallEditTxt:EditText =findViewById(R.id.editTextPhone)

        openCallBtn.setOnClickListener {
            openCall(openCallEditTxt.text.toString())
        }

        val openCallLogBtn:Button = findViewById(R.id.callLogButton)
        val openGalleryBtn:Button = findViewById(R.id.galleryButton)
        val openCameraBtn:Button = findViewById(R.id.cameraButton)
        val openAlarmBtn:Button = findViewById(R.id.alarmButton)

        openCallLogBtn.setOnClickListener {
            openCallLog()
        }

        openGalleryBtn.setOnClickListener {
            openGallery()
        }

        openCameraBtn.setOnClickListener {
            openCamera()
        }

        openAlarmBtn.setOnClickListener {
            openAlarm()
        }
    }

    fun openBrowser(url: String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }
    }

    fun openCall(no: String)
    {
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$no")).also {
            startActivity(it)
        }
    }

    fun openCallLog()
    {
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also {
            startActivity(it)
        }
    }

    fun openGallery()
    {
        Intent(Intent.ACTION_VIEW).setType("image/*").also {
            startActivity(it)
        }
    }

    fun openCamera()
    {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
            startActivity(it)
        }
    }

    fun openAlarm()
    {
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also {
            startActivity(it)
        }
    }
}

