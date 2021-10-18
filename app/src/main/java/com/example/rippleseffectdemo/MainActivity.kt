package com.example.rippleseffectdemo

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.skyfishjy.library.RippleBackground


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rippleBackground = findViewById<View>(R.id.content) as RippleBackground
        val imageView: ImageView = findViewById<View>(R.id.centerImage) as ImageView
        val layout: LinearLayout = findViewById<View>(R.id.layout) as LinearLayout
        imageView.setOnClickListener{
            rippleBackground.startRippleAnimation();
        }

        layout.setOnClickListener {
            rippleBackground.stopRippleAnimation();

        }

    }
}