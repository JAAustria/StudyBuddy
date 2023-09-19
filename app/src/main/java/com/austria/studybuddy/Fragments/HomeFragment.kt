package com.austria.studybuddy.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.austria.studybuddy.R
import com.austria.studybuddy.data.Item
import com.austria.studybuddy.data.MyAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerViewHomeScheduleFragment = rootView.findViewById<RecyclerView>(R.id.recyclerViewHomeSchedules)
        val recyclerViewHomeTaskFragment = rootView.findViewById<RecyclerView>(R.id.recyclerViewHomeSchedules)

        // Create a list of data items for FragmentA
        val items = listOf(
            Item("Item 1", "Description 1"),
            Item("Item 2", "Description 2"),
            // Add more items as needed
        )
        return rootView
    }
}