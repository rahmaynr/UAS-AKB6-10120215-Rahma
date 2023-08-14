package com.rahmayuniar.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.rahmayuniar.myprayschedule.R
import com.rahmayuniar.walktrought.walktroughtActivity

class SplashActivity : AppCompatActivity() {
    private val splashScreenTimeout =
        2500L // Durasi splash screen dalam milidetik (di sini: 3 detik)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler untuk menunda pemindahan ke aktivitas berikutnya
        Handler().postDelayed({
            val intent = Intent(this, walktroughtActivity::class.java)
            startActivity(intent)
            finish() // Menutup splash screen agar tidak bisa kembali ke sana dengan tombol "kembali"
        }, splashScreenTimeout)

    }
}