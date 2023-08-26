package com.austria.studybuddy.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.austria.studybuddy.AddScheduleDialog
import com.austria.studybuddy.NewTaskDialog
import com.austria.studybuddy.OnScheduleAddListener
import com.austria.studybuddy.OnTaskAddListener
import com.austria.studybuddy.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ScheduleFragment : Fragment(), OnScheduleAddListener {

    private var addScheduleDialog: AddScheduleDialog? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_schedule, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabAddSchedule()
    }
    private fun fabAddSchedule() {
        val fabAddSchedule: FloatingActionButton? = activity?.findViewById(R.id.fabNewSchedule)
        fabAddSchedule?.setOnClickListener {
            addScheduleDialog = activity?.let { it1 -> AddScheduleDialog(it1, this) }?.apply {
                show()
            }
        }
    }
    override fun onScheduleAdded() {
        TODO("Not yet implemented")
    }
}