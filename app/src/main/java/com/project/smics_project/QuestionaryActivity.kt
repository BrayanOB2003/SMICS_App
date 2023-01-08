package com.project.smics_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuestionaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionary)
    }

    fun openMegActivity(view: View){
        val newActivity = Intent(this, MegActivity::class.java)
        startActivity(newActivity)
    }
}