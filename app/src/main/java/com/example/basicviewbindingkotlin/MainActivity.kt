/*
 * Android App Engineer : Mr. Tayyab MuGhal
 * Fiverr: https://www.fiverr.com/mrtayyabmughal
 * Github : https://www.github.com/tayyabmughal676
 * Youtube : https://www.youtube.com/parholikhocs
 * Email: tayyabmughal676@gmail.com
 * Thank you for using my open source code. :)
 * Copyright (c) 2020
 */
package com.example.basicviewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.basicviewbindingkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    //     basic method
    private lateinit var mButton: Button
    private lateinit var mTxtView: TextView
    private lateinit var mTxtView2: TextView

    //   Advanced and Enhanced method
    lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Basic
//        setContentView(R.layout.activity_main)
//        mButton = findViewById(R.id.myButton)
//        mTxtView = findViewById(R.id.myTextView)
//        mTxtView2 = findViewById(R.id.myTextView2)
//
//        mButton.setOnClickListener {
//            Toast.makeText(applicationContext, "Hello View Binding", Toast.LENGTH_SHORT).show()
//        }

//        Advanced and Enhanced Method.
//        Initialized Activity Main Binding
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)

        mBinding.myTextView.text = "Hello I'm Main Code"
        mBinding
            .myButton
            .setOnClickListener {
                Toast.makeText(
                    applicationContext,
                    "Hello View Binding",
                    Toast.LENGTH_SHORT
                ).show()
            }
    }
}