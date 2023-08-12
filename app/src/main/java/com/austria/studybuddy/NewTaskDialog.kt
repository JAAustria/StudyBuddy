package com.austria.studybuddy

import android.app.AlertDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.austria.studybuddy.databinding.ActivityNewTaskBinding

class NewTaskDialog(
    context: Context,
    private val listener: OnTaskAddListener? = null
): AlertDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

}

interface OnTaskAddListener {
    fun onTaskAdded()
}