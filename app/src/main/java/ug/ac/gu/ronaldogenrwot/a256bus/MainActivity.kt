package ug.ac.gu.ronaldogenrwot.a256bus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
         val i = Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(i)
            finish()
        },SPLASH_TIME_OUT
        )
    }
}
