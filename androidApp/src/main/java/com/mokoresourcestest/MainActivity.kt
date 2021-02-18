package com.mokoresourcestest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.espoto.mokoresourcestest.androidApp.R
import dev.icerock.moko.resources.desc.PluralFormatted
import dev.icerock.moko.resources.desc.StringDesc
import resources.generated.MR

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
//        tv.text = StringDesc.PluralFormatted(MR.plurals.solveMcFull, 1, 1).toString(this)
        tv.text = Greeting().greeting()
    }
}
