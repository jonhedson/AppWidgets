package br.edu.infnet.appdynamicautocompletetextview

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create AutoCompleteTextView and button
        val autotextView = AutoCompleteTextView(this)
        val button = Button(this)
        val layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        autotextView.layoutParams = layoutParams
        button.layoutParams = layoutParams
        layoutParams.setMargins(30, 30, 30, 30)
        autotextView.setHint(R.string.hint)
        button.text = "Submit"

        val linearLayout = findViewById<LinearLayout>(R.id.linear_layout)
        // Add AutoCompleteTextView and button to LinearLayout
        linearLayout?.addView(autotextView)
        linearLayout?.addView(button)


        // Get the array of languages
        val languages = resources.getStringArray(R.array.Languages)
        // Create adapter and add in AutoCompleteTextView
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, languages)
        autotextView.setAdapter(adapter)


        if (button != null) {
            button.setOnClickListener(View.OnClickListener {
                val enteredText = getString(R.string.submitted_lang)+ " " +
                        autotextView.text
                Toast.makeText(this@MainActivity,
                    enteredText, Toast.LENGTH_SHORT).show()
            })
        }
    }
}
