package com.example.lunchfox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

var list = mutableListOf<Any>() //список куда будут класться элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Назначаем в контейнер созданный в xml фрагмент FirstFragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, FirstFragment())
        transaction.commit()
    }
}