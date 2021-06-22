package com.example.giftapp.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.giftapp.R

class RegisterFragment : Fragment(R.layout.fragment_register) {

    private lateinit var registerEmail : TextView
    private lateinit var registerPassword : TextView
    private lateinit var registrationButton : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        registerEmail = view.findViewById(R.id.RegisterEmail)
        registerPassword = view.findViewById(R.id.RegisterPassword)
        registrationButton = view.findViewById(R.id.RegisterButton)




        registrationButton.setOnClickListener {
            var registrationMail = registerEmail.text.toString()
            var registrationPassword = registerPassword.text.toString()


            if(registrationMail.isEmpty() || registrationPassword.isEmpty()){
                Toast.makeText(activity, "Email or Password is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
        }


    }
}