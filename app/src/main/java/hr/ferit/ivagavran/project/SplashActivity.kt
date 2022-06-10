package hr.ferit.ivagavran.project

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        window.setFlags( //fullscreen
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val typeFace: Typeface = Typeface.createFromAsset(assets, "Roboto-Bold.ttf") //font
        tv_geek.typeface = typeFace //font

        Handler(Looper.getMainLooper()).postDelayed( //move to next after 2secs
            {

                // Start the Intro Activity
                startActivity(Intent(this@SplashActivity, IntroActivity::class.java))

                // Call this when your activity is done and should be closed.
                finish()

            },
            2500
        )
    }


}