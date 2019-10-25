package com.freddie.democonfigwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action_bar_over_lay.*

class ActionBarOverLayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_over_lay)
        toggle_button.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // The toggle is enabled
                supportActionBar?.hide()
            } else {
                // The toggle is disabled
                supportActionBar?.show()
            }
        }
    }
}
