package com.example.myfirstapplication

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.adapter = MediaAdapter(getItems())

        val buttonNext: Button = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener {
            /*
            val intent = Intent(this, test::class.java).apply {
                toast("Go Test activity")
            }
            startActivity(intent)
            */

            //EJEMPLO de Reified
            //Llamada a un activity normal
            //val intent = Intent(this, test::class.java)
            //startActivity(intent)

            //Llamada a un activity utilizando función de extensión y tipos Reified
            startActivity<test>()
        }

        recycler.setOnClickListener { toast("Hello onClick Listener") }



    }

}