package com.example.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

       supportActionBar?.setHomeButtonEnabled(true)
       supportActionBar?.setDisplayHomeAsUpEnabled(true)

       val tvResult = findViewById<TextView>(R.id.textview_result)
       val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

       val result = intent.getFloatExtra("EXTRA_RESULT",0.1f)
       tvResult.text = result.toString()



        val classificacao = if(result < 18.5f){
             "ABAIXO DO PESO "
        }else if(result >= 18.5f && result <= 24.9f){
             "NORMAL "
        }else if (result >=25f && result <= 29.9f ){
             "SOBREPESO "
        }else if(result >= 30f && result <= 39.9f){
             "OBESIDADE "
        }else{
             "OBESIDADE GRAVE "
        }

        tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}