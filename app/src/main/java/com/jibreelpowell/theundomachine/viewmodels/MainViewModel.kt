package com.jibreelpowell.theundomachine.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jibreelpowell.theundomachine.snapshot.Snapshot

class MainViewModel : ViewModel() {

    val currentText = MutableLiveData<String>()

    val saveHistory: MutableList<Snapshot> = arrayListOf()
}