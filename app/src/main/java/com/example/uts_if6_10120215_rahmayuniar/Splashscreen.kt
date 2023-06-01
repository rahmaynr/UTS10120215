package com.example.uts_if6_10120215_rahmayuniar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler



        class SplashScreenActivity : AppCompatActivity() {

            private val splashScreenTimeout =
                3000L // Durasi splash screen dalam milidetik (di sini: 3 detik)

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_splashscreen)

                // Handler untuk menunda pemindahan ke aktivitas berikutnya
                Handler().postDelayed({
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish() // Menutup splash screen agar tidak bisa kembali ke sana dengan tombol "kembali"
                }, splashScreenTimeout)
            }
        }
