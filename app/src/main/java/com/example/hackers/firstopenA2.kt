package com.example.hackers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class firstopenA2 : AppCompatActivity() {
    private val delayMillis: Long = 3000 // 3초

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstopen_a2)

        // Handler를 사용하여 3초 후에 액티비티 전환 작업 수행
        Handler().postDelayed({
            val intent = Intent(this, firstopenA3::class.java)
            startActivity(intent)
            onStop()
//            finish() // 현재 액티비티를 종료하여 뒤로 가기로 돌아가지 않도록 설정
        }, delayMillis)
    }
}