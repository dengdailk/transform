package com.dengdai.transform

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivImage.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ivImage -> {
                val bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    this,
                    ivImage,"activityTransform"
                ).toBundle()
                startActivity(Intent(this, SecondActivity::class.java), bundle)
            }
        }
    }
}