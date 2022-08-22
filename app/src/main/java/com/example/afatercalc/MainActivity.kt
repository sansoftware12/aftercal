package com.example.afatercalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttoonweb:Button
    lateinit var Buttonintent:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_calc)
        Buttoonweb=findViewById(R.id.btn_web)
        Buttonintent=findViewById(R.id.btn_int)

        Buttoncalc.setOnClickListener {
           val intent=Intent(this,CalculatorActivity::class.java)
           startActivity(intent)
        }

        Buttoonweb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
        }
        Buttonintent.setOnClickListener {
            val Calc=Intent( this,intentActivity::class.java)
            startActivity(Calc)
        }
    }
}