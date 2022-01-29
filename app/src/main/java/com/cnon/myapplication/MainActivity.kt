package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sayilardizisi = Array<Int>(10){5}

       for(i in 0..sayilardizisi.size-1)

        {
            sayilardizisi[i] =i+1
            println(sayilardizisi[i])
        }


        var anydizisi = arrayOf("ffdf",5,true,67L,6.7,5.7f)
        // sayilardizisi[i] =i+1
        for(i in anydizisi) println(i)

        anydizisi[0] = true
        anydizisi[1] = 56
        anydizisi[2] = 7.21
        anydizisi[3] = 'c'

        for(i in anydizisi) println(i)






    }
}