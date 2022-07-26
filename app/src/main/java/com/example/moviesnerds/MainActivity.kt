package com.example.moviesnerds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.moviesnerds.databinding.ActivityMainBinding
import com.example.moviesnerds.ui.MainController

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val maincontroller:MainController= MainController()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initui()
    }
    private fun initui(){
        binding.btnLogin.setOnClickListener{
            if(maincontroller.login(binding.usernameEdittext.text.toString(),
               binding.passwordEdittext.text.toString()
                )==1)
            {
                Toast.makeText(this,"login is succeeded",Toast.LENGTH_SHORT).show()
            }else  Toast.makeText(this,"login is Failed",Toast.LENGTH_SHORT).show()
        }
    }
}