package com.example.loginScreenByMVP.ui

import com.example.loginScreenByMVP.contracts.mainContract
import com.example.loginScreenByMVP.database.DataBase

class MainPresenter (private val mainView: mainContract.MainView):mainContract.MainPresenter{
    override fun loging(username: String, password: String) {
        if(username==DataBase.getCurrentUser().username&&password==DataBase.getCurrentUser().password){
        mainView.onSuccess("success")
    }else{
            mainView.onFailed("Failed")

        }

}}