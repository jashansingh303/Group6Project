package edu.qc.seclass.fitbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val createAccountBtn: Button
        createAccountBtn = findViewById<Button>(R.id.createAccountBtn)

        createAccountBtn.setOnClickListener{
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
        }
    }
}