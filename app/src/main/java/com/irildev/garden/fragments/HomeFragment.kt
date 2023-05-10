package com.irildev.garden.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.irildev.garden.R
import com.irildev.garden.adapter.PlantAdapter
import com.irildev.garden.adapter.PlantItemDecoration

class HomeFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //get le recycler
        val horizontalRecyclerView = view?.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        if (horizontalRecyclerView != null) {
            horizontalRecyclerView.adapter = PlantAdapter(R.layout.item_horizontal_plant)
        }
        //get le second recycler
        val verticalRecyclerView = view?.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        if (verticalRecyclerView != null) {
            verticalRecyclerView.adapter = PlantAdapter(R.layout.item_vertical_plant)
        }

        verticalRecyclerView?.addItemDecoration(PlantItemDecoration())

        return view
    }

}