package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
//import kotlinx.android.synthetic.main.activity_result.*



class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        //setListeners()
        Log.w("lifecycle","CREATE - estou criando a tela")
    }

    override fun onStart() {
       super.onStart()
       Log.w("lifecycle","START - deixei a tela visivel para voce.")
     }

    override fun onResume() {
    super.onResume()
    Log.w("lifecycle","RESUME - agora voce pode interagir com a tela")
    }

    override fun onPause() {
    super.onPause()
    Log.w("lifecycle","PAUSE - a tela perdeu o foco,voce nao pode mais interagir")
    }

    override fun onStop() {
    super.onStop()
    Log.w("lifecycle","STOP - a tela não esta mais visivel , mas ainda existe")

    }

    override fun onRestart() {
    super.onRestart()
    Log.w("lifecycle","\n entrei no RESTART - a tela esta retomando o foco")
    }

    override fun onDestroy() {
    super.onDestroy()
     Log.w("lifecycle","\n entrei no DESTROY - oh, não! a tela foi destruida")
    }



}