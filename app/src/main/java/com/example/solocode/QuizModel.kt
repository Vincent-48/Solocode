package com.example.solocode

data class QuizModel(
    var id : String,
    var title : String,
    var subtitle : String,
    var time : String,
    val questionList : List<QuestionModel>
){
    constructor():this("","","","", emptyList())
}
data class QuestionModel(
    val question : String,
    val options : List<String>,
    val correct : String,
){
    constructor(): this("", emptyList(),"")
}
