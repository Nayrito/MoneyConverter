package com.example.moneyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    val Null = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btEuro_Dollar.setOnClickListener {
            val type =1
            if(etValue.text.isEmpty()){
                Toast.makeText(this,"Insert Value",Toast.LENGTH_LONG).show()
            }else{
                var value = etValue.text.toString().toFloat()
                tvEuros.text = Null
                tvCop.text = Null
                calculate(type,value)
            }
        }
        btDollar_Euro.setOnClickListener {
            val type =2
            if(etValue.text.isEmpty()){
                Toast.makeText(this,"Insert Value",Toast.LENGTH_SHORT).show()
            }else{
                var value = etValue.text.toString().toFloat()
                tvDollar.text = Null
                tvCop.text = Null
                calculate(type,value)

            }
        }
        btCop_Dollar.setOnClickListener {
            val type =3
            if(etValue.text.isEmpty()){
                Toast.makeText(this,"Insert Value",Toast.LENGTH_SHORT).show()
            }else{
                var value = etValue.text.toString().toFloat()
                tvCop.text = Null
                tvEuros.text = Null
                calculate(type,value)

            }
        }
        btDollar_Cop.setOnClickListener {
            val type =4
            if(etValue.text.isEmpty()){
                Toast.makeText(this,"Insert Value",Toast.LENGTH_SHORT).show()
            }else{
                var value = etValue.text.toString().toFloat()
                tvDollar.text = Null
                tvEuros.text = Null
                calculate(type,value)

            }
        }
        btCop_Euro.setOnClickListener {
            val type =5
            if(etValue.text.isEmpty()){
                Toast.makeText(this,"Insert Value",Toast.LENGTH_SHORT).show()
            }else{
                var value = etValue.text.toString().toFloat()
                tvCop.text = Null
                tvDollar.text = Null
                calculate(type,value)

            }
        }
        btEuro_Cop.setOnClickListener {
            val type =6
            if(etValue.text.isEmpty()){
                Toast.makeText(this,"Insert Value",Toast.LENGTH_SHORT).show()
            }else{
                var value = etValue.text.toString().toFloat()
                tvDollar.text = Null
                tvEuros.text = Null
                calculate(type,value)

            }
        }
    }
    private fun calculate(type:Int,entervalue:Float){
        var convertion=0.0
        when(type){
            1->{
                convertion = entervalue*1.12
                tvDollar.text = convertion.toString()
            }
            2 ->{
                convertion = entervalue*0.89
                tvEuros.text = convertion.toString()
            }
            3 ->{
                convertion = entervalue*0.00031
                tvDollar.text = convertion.toString()
            }
            4 ->{
                convertion = entervalue*3174.15
                tvCop.text = convertion.toString()
            }
            5 ->{
                convertion = entervalue*0.00028
                tvEuros.text = convertion.toString()
            }
            6 ->{
                convertion = entervalue*3559.27
                tvCop.text = (convertion).toString()
            }
        }
    }
}
