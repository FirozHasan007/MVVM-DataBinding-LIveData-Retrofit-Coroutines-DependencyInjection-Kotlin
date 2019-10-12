package com.example.firozhasan.retrofitkotlinexample.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.firozhasan.retrofitkotlinexample.model.repos.AllCountriesRepository
import com.example.firozhasan.retrofitkotlinexample.util.lazyDeferred

class AllCountriesViewModel(private val repository : AllCountriesRepository)
    : ViewModel() {

    val allcountries by lazyDeferred {
        Log.d("hellohello","view model e asche+ ")

        repository.getALLCounty2()
    }



}