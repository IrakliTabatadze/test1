package com.example.giftapp.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.giftapp.R

class PasswordForgotFragment : Fragment(R.layout.fragment_passwordforgot) {

    private lateinit var recoverMail : TextView
    private lateinit var code : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recoverMail = view.findViewById(R.id.PasswordResetEmail)


        code.setOnClickListener {
            var recoveryMail = recoverMail.text.toString()

            if (recoveryMail.isEmpty()){
                Toast.makeText(activity, "Email is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }
}