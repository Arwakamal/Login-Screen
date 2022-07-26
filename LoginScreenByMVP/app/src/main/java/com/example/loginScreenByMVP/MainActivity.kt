package com.example.loginScreenByMVP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginScreenByMVP.contracts.mainContract
import com.example.loginScreenByMVP.databinding.ActivityMainBinding
import com.example.loginScreenByMVP.ui.MainPresenter

class MainActivity : AppCompatActivity() ,mainContract.MainView{
    private lateinit var binding:ActivityMainBinding
    private lateinit var mainPresenter: mainContract.MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainPresenter= MainPresenter(this)

        initPresenter()
    }
    private fun initPresenter(){

        mainPresenter=MainPresenter(this)
        binding.btnLogin.setOnClickListener{

            mainPresenter.loging(binding.usernameEdittext.text.toString(),
                    binding.passwordEdittext.text.toString())
        }

    }

    override fun onSuccess(message: String) {
         Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun onFailed(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}