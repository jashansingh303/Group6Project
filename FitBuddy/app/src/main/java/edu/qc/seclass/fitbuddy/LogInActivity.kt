package edu.qc.seclass.fitbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signInBtn = findViewById<Button>(R.id.signInBtn)
        val signUpBtn:Button

        signUpBtn = findViewById<Button>(R.id.signUpBtn)

        signUpBtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        signInBtn.setOnClickListener{
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
        }
    }
}