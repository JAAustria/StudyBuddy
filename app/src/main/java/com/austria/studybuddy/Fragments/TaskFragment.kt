package com.austria.studybuddy.Fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.austria.studybuddy.NewTaskDialog
import com.austria.studybuddy.OnTaskAddListener
import com.austria.studybuddy.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TaskFragment : Fragment(), OnTaskAddListener {

    private var newTaskDialog: NewTaskDialog? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabNewTask()
    }

    private fun fabNewTask() {
        val fabAddTask: FloatingActionButton? = activity?.findViewById(R.id.fabNewTask2)
        fabAddTask?.setOnClickListener {
            newTaskDialog = activity?.let { it1 -> NewTaskDialog(it1, this) }?.apply {
                show()
            }
        }
    }

    override fun onTaskAdded() {
        TODO("Not yet implemented")
    }
}

