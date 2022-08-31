package br.edu.infnet.appautocompletetextview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autotextView = findViewById<AutoCompleteTextView>(R.id.autoTextView)
        // Get the array of languages
        val languages = resources.getStringArray(R.array.Languages)
        // Create adapter and add in AutoCompleteTextView
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, languages
        )
        autotextView.setAdapter(adapter)

        val button = findViewById<Button>(R.id.btn)

        if (button != null)
        {
            button?.setOnClickListener(View.OnClickListener {
            val enteredText = getString(R.string.submitted_lang) + " " + autotextView.text
                Toast.makeText(this@MainActivity, enteredText, Toast.LENGTH_SHORT).show()
        })
        }
    }
}
