package com.example.check4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count:Int=0
        var count2:Int=count/4

        button.setOnClickListener{
            count++
            counttext.text=count.toString()

            when(count2){
                0-> print("Life is Teck!")
                1-> print("名古屋土曜")
                2-> print("Androidコース")
                3->print("あみだ班")
            }
        }


    }
}
