package com.example.myfirstapplication

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
            val intent = Intent(this, test::class.java).apply {
                toast("Go Test activity")
            }
            startActivity(intent)

        }

        recycler.setOnClickListener { toast("Hello onClick Listener") }

    }



    fun toast (textToast: String) = Toast.makeText(this, textToast, Toast.LENGTH_SHORT).show()
}


