package com.example.afatercalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Firstnumber:EditText
    lateinit var secondnumber:EditText
    lateinit var textanswer:TextView
    lateinit var Buttonsubtract:Button
    lateinit var Buttonmultiply:Button
    lateinit var Buttondivide:Button
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Buttonadd=findViewById(R.id.btn_add)
        Firstnumber=findViewById(R.id.txt_first)
        secondnumber=findViewById(R.id.txt_second)
        textanswer=findViewById(R.id.txt_Answer)
        Buttonsubtract=findViewById(R.id.btn_sub)
        Buttonmultiply=findViewById(R.id.btn_mult)
        Buttondivide=findViewById(R.id.btn_div)



        Buttonadd.setOnClickListener {
            var firstnum=Firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()

          if (firstnum.isEmpty() && secondnum.isEmpty()){
              textanswer.text="please fill in all inputs"
          }else{
              var answer=firstnum.toDouble()+secondnum.toDouble()
              textanswer.text=answer.toString()
          }
        }

        Buttonsubtract.setOnClickListener {
            var firstnum=Firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()

            if (   firstnum.isEmpty() && secondnum.isEmpty() ){
                textanswer.text="please fill in all inputs"
            } else{
                var answer=firstnum.toDouble()-secondnum.toDouble()
                textanswer.text=answer.toString()
            }


        }

        Buttondivide.setOnClickListener {

            var firstnum=Firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()

            if (   firstnum.isEmpty() && secondnum.isEmpty() ){
                textanswer.text="please fill in all inputs"
            } else{
                var answer=firstnum.toDouble()/secondnum.toDouble()
                textanswer.text=answer.toString()
            }
        }
        Buttonmultiply.setOnClickListener {

            var firstnum=Firstnumber.text.toString()
            var secondnum=secondnumber.text.toString()

            if (   firstnum.isEmpty() && secondnum.isEmpty() ){
                textanswer.text="please fill in all inputs"
            } else{
                var answer=firstnum.toDouble()*secondnum.toDouble()
                textanswer.text=answer.toString()
            }


        }

        }

    }
