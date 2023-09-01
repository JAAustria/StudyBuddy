package com.austria.studybuddy

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.austria.studybuddy.databinding.DialogAddScheduleBinding
import com.austria.studybuddy.databinding.DialogNewTaskBinding

class AddScheduleDialog(
    context: Context,
    private val listener: OnScheduleAddListener? = null
): AlertDialog(context) {

    private var binding: DialogAddScheduleBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogAddScheduleBinding.inflate(LayoutInflater.from(context))
        setContentView(binding!!.root)
    }
}

interface OnScheduleAddListener {
    fun onScheduleAdded()
}