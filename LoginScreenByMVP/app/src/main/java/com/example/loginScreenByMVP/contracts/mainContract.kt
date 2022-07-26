package com.example.loginScreenByMVP.contracts

interface mainContract {

    interface MainView{
        fun onSuccess(message:String)
        fun onFailed(message:String)
    }
    interface MainPresenter{
        fun loging(username:String,password:String)
    }
}