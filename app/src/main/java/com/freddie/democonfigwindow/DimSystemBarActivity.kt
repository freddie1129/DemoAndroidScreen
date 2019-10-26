package com.freddie.democonfigwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dim_system_bar.*

class DimSystemBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dim_system_bar)
        button_dim.setOnCheckedChangeListener{_,bcheck->
            if (bcheck)
            {
                window?.decorView?.apply {
                    systemUiVisibility = View.SYSTEM_UI_FLAG_LOW_PROFILE
                }
            }
            else
            {
                window?.decorView?.apply {
                    systemUiVisibility = 0
                }
            }

        }


    }
}
