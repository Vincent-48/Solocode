package com.example.solocode

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.solocode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var quizModelList : MutableList<QuizModel>
    lateinit var adapter: QuizListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModelList = mutableListOf()
        getDataFromFirebase()





    }
    private fun setupRecyclerView(){
        adapter = QuizListAdapter(quizModelList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

    }
    private fun getDataFromFirebase(){
        //dummy data
        val listQuestionModel = mutableListOf<QuestionModel>()
        listQuestionModel.add(QuestionModel("What is android?", mutableListOf("language","OS","Product","None"),"OS"))
        listQuestionModel.add(QuestionModel("What owns android?", mutableListOf("Apple","Samsung","Google","Microsoft"),"Google"))
        listQuestionModel.add(QuestionModel("What is assistant does android uses?", mutableListOf("Cortana","Siri","Google Assistant","Alexa"),"Google Assistant"))

        quizModelList.add(QuizModel("1","Programming","All the basic programming","10",listQuestionModel))
        //quizModelList.add(QuizModel("2","Computer","All the basics of computer","20"))
       // quizModelList.add(QuizModel("3","Geography","boost your geography knowledge","15"))
        setupRecyclerView()
    }






}