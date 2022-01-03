package com.ebookfrenzy.viewmodeldem0.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val rate = 0.74f
    private var dollarText = ""
//    private var result: Float = 0f
    // Add LiveData to ViewModel
    private var result: MutableLiveData<Float> = MutableLiveData()

    fun setAmount(value: String) {
        this.dollarText = value
//        result = value.toFloat() * rate
        result.setValue(value.toFloat() * rate)
    }
    // fun getResult(): Float
    fun getResult(): MutableLiveData<Float> {
        return result
    }
}