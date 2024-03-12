package com.example.solocode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solocode.databinding.ActivityMainBinding

class QuizActivity : AppCompatActivity() {
    companion object{
        var questionModelList: List<QuestionModel> = listOf()
    }
    lateinit var binding: ActivityMainBinding

    var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun loadQuestions(){
        binding.apply {

        }
    }
}