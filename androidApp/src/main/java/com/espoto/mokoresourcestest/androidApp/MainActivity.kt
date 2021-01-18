package com.espoto.mokoresourcestest.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.espoto.mokoresourcestest.SharedCode.Greeting
import android.widget.TextView
import com.espoto.resources.MR
import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = StringDesc.Resource(MR.strings.helloMoko).toString(this)
    }
}
