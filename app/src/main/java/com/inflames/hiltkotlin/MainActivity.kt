package com.inflames.hiltkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject // Field Injection
    lateinit var lars: Musician

    @Inject
    lateinit var myClass: ClassExample


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lars.sing()
        println(myClass.myFunction())
        println(myClass.mySecondFun())
    }
}