package uz.xsoft.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.forEach
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_input.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAdd.setOnClickListener {
            layoutGroup.inflate(R.layout.item_input) {
                inputLayout.hint = inputText.text.toString()
            }
            inputText.setText("")
        }
        buttonClear.setOnClickListener {
            layoutGroup.forEach {
                it.editText.setText("")
            }
        }
    }
}