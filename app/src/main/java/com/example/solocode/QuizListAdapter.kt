package com.example.solocode

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.solocode.databinding.QuizItemRecyclerRowBinding

class QuizListAdapter(private val quizModelList : List<QuizModel>) :
    RecyclerView.Adapter<QuizListAdapter.myViewHolder>() {

    class myViewHolder(private val binding: QuizItemRecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (model: QuizModel){
            //bind all the views
            binding.apply {
                quizTitleText.text = model.title
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val binding = QuizItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return myViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return quizModelList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.bind(quizModelList[position])
    }
}