package com.example.quizapp.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.data.QuizFakeData
import com.example.quizapp.db.QuizDB

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initQuizData()
        setContentView(R.layout.activity_main)
    }

    private fun initQuizData() {
        val initialQuestions = QuizFakeData.getQuizQuestions()
        val quizDAO = QuizDB(this).getQuizDAO()

        MainScope().launch(Dispatchers.IO) {
            quizDAO.insertQuizQuestions(initialQuestions)
        }
    }

}