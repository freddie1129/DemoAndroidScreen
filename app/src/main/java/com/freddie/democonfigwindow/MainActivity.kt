package com.freddie.democonfigwindow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_action_overlay.setOnClickListener {x -> Unit
            var intent = Intent(this,ActionBarOverLayActivity::class.java)
            startActivity(intent)
             }
        text_fullscreen.setOnClickListener {
            var intent = Intent(this, FullscreenActivity::class.java)
            startActivity(intent)
        }
        text_dim_system_bar.setOnClickListener {
            var intent = Intent(this, DimSystemBarActivity::class.java)
            startActivity(intent)
        }
    }
}
