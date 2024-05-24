package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.DataSource
import com.example.myapplication.data.model.User

class SharedViewModel : ViewModel() {
    fun createUser(name:String,pw:Int){
        DataSource.user.add(User(name, pw))
    }
    fun notizten(notiz:String){

    }
}