package com.example.myfirstapplication

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

fun test(view: View){
    val result = when (view) {
        is TextView -> print(view.text)
        is ViewGroup -> print(view.childCount)
        else -> print(" Nothing found")
    }
}