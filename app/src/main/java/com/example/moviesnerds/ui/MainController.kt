package com.example.moviesnerds.ui

import com.example.moviesnerds.database.DataBase

class MainController {
    fun login(username:String,password:String):Int{
        return  if(
            username==DataBase.getCurrentUser().username&&
            password==DataBase.getCurrentUser().password
        )
                1 else 0
    }
}