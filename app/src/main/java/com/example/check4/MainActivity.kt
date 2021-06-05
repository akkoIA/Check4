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
        val name1="Life is Teck!"
        val name2="名古屋土曜"
        val name3="Androidコース"
        val name4="あみだ班"


        button.setOnClickListener{
            count++
            counttext.text=count.toString()

            when(count2){
                0-> print(count+{$name1})
                1-> print("名古屋土曜")
                2-> print("Androidコース")
                3->print("あみだ班")
            }
        }


    }
}
