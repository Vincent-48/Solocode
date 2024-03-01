package com.example.solocode

data class QuizModel(
    var id : String,
    var title : String,
    var subtitle : String,
    var time : String,
){
    constructor():this("","","","")
}
