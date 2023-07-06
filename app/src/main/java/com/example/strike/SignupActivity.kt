package com.example.strike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignupActivity : AppCompatActivity() {

    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfpassword: EditText
    lateinit var signup: Button
    lateinit var mylogin: TextView
    private lateinit var auth: FirebaseAuth //creating firebase authentication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        myemail=findViewById(R.id.Email)
        mypassword=findViewById(R.id.password)
        myconfpassword=findViewById(R.id.confpassword)
        signup=findViewById(R.id.button)
        mylogin=findViewById(R.id.textView)
        auth= Firebase.auth

        mylogin.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        signup.setOnClickListener {
            SignUpUser()
        }
    }


    private fun SignUpUser(){
        val email=myemail.text.toString()
        val pass=mypassword.text.toString()
        val confirmpass=myconfpassword.text.toString()
        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()){
            Toast.makeText(this,"Please Email and password can't be blank", Toast.LENGTH_LONG).show()
            return
        }
        else if(pass != confirmpass){
            Toast.makeText(this,"Password do not match", Toast.LENGTH_LONG).show()
            return
        }

        val addOnCompleteListener =
            auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this,"Signed up Successfully", Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Failed to Create", Toast.LENGTH_LONG).show()
                }
            }
    }
}