package com.example.loginScreenByMVP.database

import com.example.loginScreenByMVP.data.User

object DataBase {
    fun getCurrentUser():User{
        return User("Arwa","1233445")
    }
}