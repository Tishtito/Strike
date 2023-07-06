package com.example.strike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var myemail: EditText
    private lateinit var mypassword1: EditText
    lateinit var login1: Button
    lateinit var signup: TextView
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        myemail=findViewById(R.id.Email)
        mypassword1=findViewById(R.id.password)
        login1=findViewById(R.id.button)
        signup=findViewById(R.id.textView)
        auth= FirebaseAuth.getInstance()

        login1.setOnClickListener {
            login()
        }

        signup.setOnClickListener {
            val intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun login(){
        val email = myemail.text.toString()
        val pass = mypassword1.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if(it.isSuccessful){
                Toast.makeText(this,"Successfully LoggedIn", Toast.LENGTH_LONG).show()
                val intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this,"Log In failed", Toast.LENGTH_LONG).show()
        }
    }
}