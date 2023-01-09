package com.project.smics_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuestionnaireActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionary)
    }

    fun openMegActivity(view: View){
        val newActivity = Intent(this, MegActivity::class.java)
        startActivity(newActivity)
    }

    fun openFactorsActivity(view: View) {
        val newActivity = Intent(this, FactorsActivity::class.java)
        startActivity(newActivity)
    }

    fun openMegEvaluation(view: View){

    }

    fun openRegisterGeneralData(view: View){

    }
}