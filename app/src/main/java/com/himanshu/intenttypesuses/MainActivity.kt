package com.himanshu.intenttypesuses

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var btnSms: Button?=null
    var btnWebsite: Button?=null
    var btnCall: Button?=null
    var etPhoneNo: EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         btnSms= findViewById(R.id.btnSms)
         btnWebsite= findViewById(R.id.btnWebsite)
         btnCall= findViewById(R.id.btnCall)
        etPhoneNo=findViewById(R.id.etPhoneNo)
    btnSms?.setOnClickListener {
        var intent= Intent( Intent.ACTION_SENDTO)
        intent.data = Uri.parse("Helloo:$etPhoneNo")
        startActivity(intent)
    }
    btnWebsite?.setOnClickListener {
        var intent= Intent( Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://google.com")
        startActivity(intent)
    }
        btnCall?.setOnClickListener {
            var intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("$etPhoneNo")
            startActivity(intent)
        }
        }
}