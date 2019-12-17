package com.freddie.democonfigwindow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_action_bar_hide_show.setOnClickListener { x -> Unit
            var intent = Intent(this,ActionBarHideShowActivity::class.java)
            startActivity(intent)
             }
        text_status_bar_hide_show.setOnClickListener {
            var intent = Intent(this, StatusBarHideShowActivity::class.java)
            startActivity(intent)
        }
        text_navigation_bar_hide_show.setOnClickListener {
            var intent = Intent(this, NavigationBarHideShowActivity::class.java)
            startActivity(intent)
        }

        button_lean_back_fullscreen.setOnClickListener {
            var intent = Intent(this, LeanBackActivity::class.java)
            startActivity(intent)
        }

        button_immersive_fullscreen.setOnClickListener {
            var intent = Intent(this, ImmersiveActivity::class.java)
            startActivity(intent)
        }

        button_sticky_immersive_fullscreen.setOnClickListener {
            var intent = Intent(this, StickyImmersiveActivity::class.java)
            startActivity(intent)
        }
    }



}
