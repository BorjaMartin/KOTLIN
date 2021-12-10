package com.example.myfirstapplication

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

fun Context.toast (textToast: String, length: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, textToast, length).show()
}


fun RecyclerView.ViewHolder.toastView (textToast: String){
    itemView.context.toast(textToast)
}

fun ViewGroup.parentInflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater
        .from(context)
        .inflate(layoutRes, this, attachToRoot)
}


fun ImageView.loadUrl(url: String) {
    Glide.with(this).load(url).into(this)
}

inline fun <reified T: Activity> Context.startActivity(){
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}

