package com.rahmayuniar.walktrought

import com.rahmayuniar.walktrought.walkthroughA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.rahmayuniar.myprayschedule.R

class walktroughtActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var walkthroughA: walkthroughA


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walktrought)

        viewPager = findViewById(R.id.viewPager)

        val fragments = listOf(
            walktrought(),

        )

        walkthroughA = walkthroughA(this, fragments)
        viewPager.adapter = walkthroughA

        // Tambahkan kode lain yang diperlukan untuk mengatur tampilan WalkthroughActivity
    }
}
