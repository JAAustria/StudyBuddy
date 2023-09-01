package com.austria.studybuddy

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.austria.studybuddy.databinding.DialogNewTaskBinding

class NewTaskDialog(
    context: Context,
    private val listener: OnTaskAddListener? = null
): AlertDialog(context) {

    private var binding: DialogNewTaskBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogNewTaskBinding.inflate(LayoutInflater.from(context))
        setContentView(binding!!.root)
    }

}

interface OnTaskAddListener {
    fun onTaskAdded()
}