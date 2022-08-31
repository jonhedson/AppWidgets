package br.edu.infnet.apptextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.text_view_id) as TextView
        textView.setOnClickListener{ Toast.makeText(this@MainActivity,
            R.string.text_on_click, Toast.LENGTH_LONG).show() }
    }

}
