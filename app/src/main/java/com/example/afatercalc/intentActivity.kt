package com.example.afatercalc

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest


class intentActivity : AppCompatActivity() {
    lateinit var Buttonsms:Button
    lateinit var Buttoncam:Button
    lateinit var Buttonemail:Button
    lateinit var Buttoncall:Button
    lateinit var Buttondial:Button
    lateinit var Buttonstk:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttonsms=findViewById(R.id.txt_sms)
        Buttoncam=findViewById(R.id.txt_cam)
        Buttonemail=findViewById(R.id.txt_email)
        Buttoncall=findViewById(R.id.txt_call)
        Buttondial=findViewById(R.id.txt_dial)
        Buttonstk=findViewById(R.id.txt_stk)

        Buttonsms.setOnClickListener {

            val uri: Uri = Uri.parse("smsto:YOUR_SMS_NUMBER")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "The SMS text")

            startActivity(intent)
        }
        Buttoncam.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }
        Buttonemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }
        Buttoncall.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@intentActivity, android.Manifest.permission.CALL_PHONE
//
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@intentActivity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }

        }
        Buttondial.setOnClickListener {
            val phone = "+34666777888"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)
        }
        Buttonstk.setOnClickListener {

            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) } 
        }
        







    }
}