package com.freddie.democonfigwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action_bar_hide_show.*

class ActionBarHideShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_hide_show)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle_button.setOnCheckedChangeListener { _, isChecked ->
            supportActionBar?.run { if (isChecked) hide() else show() }
        }

    }
}
