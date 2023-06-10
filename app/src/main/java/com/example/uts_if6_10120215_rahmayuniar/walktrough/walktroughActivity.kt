package com.example.uts_if6_10120215_rahmayuniar.walktrough

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import androidx.viewpager2.widget.ViewPager2
import com.example.uts_if6_10120215_rahmayuniar.R

class walktroughActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var walkthroughA: walkthroughA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walktrough)

        viewPager = findViewById(R.id.viewPager)

        val fragments = listOf(
            walktrough1(),
            walktrough2(),
            walktrough3(),
        )

        walkthroughA = walkthroughA(this, fragments)
        viewPager.adapter = walkthroughA

        // Tambahkan kode lain yang diperlukan untuk mengatur tampilan WalkthroughActivity

}
    }
