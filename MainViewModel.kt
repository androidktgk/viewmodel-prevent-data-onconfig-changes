package com.govind8061.simplesimple

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var counter=0;

    fun increment(){
        counter++
    }

}