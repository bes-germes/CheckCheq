package com.example.checkcheq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonCreatingMeeting(view: View){
        val intent_creating_meeting = Intent(this, AddMembers::class.java)
        startActivity(intent_creating_meeting)
    }

}