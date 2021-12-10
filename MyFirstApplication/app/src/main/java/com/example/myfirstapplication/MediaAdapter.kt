package com.example.myfirstapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myfirstapplication.MediaItem.Type

open class MediaAdapter(private val items: List<MediaItem>) :
        RecyclerView.Adapter<MediaAdapter.ViewHolder>() {

    //Inflaremos la vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        //val view = LayoutInflater
        //        .from(parent.context)
        //        .inflate(R.layout.view_media_item, parent, false)
        val view = parent.parentInflate(R.layout.view_media_item)
        return ViewHolder(view)
    }

    //Asignaremos los valores correspondientes a la lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val item = items[position]
        return holder.bind(item)
    }

    //Devolver el numero de items que tiene nuestro MediaAdapter
    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.mediaTitle)
        private val thumb: ImageView = itemView.findViewById(R.id.mediaThumb)
        private val videIndicator: ImageView = itemView.findViewById(R.id.mediaVideIndicator)

        fun bind(mediaItem: MediaItem){
            title.text = mediaItem.title
            thumb.loadUrl(mediaItem.url)
            //Glide.with(thumb).load(mediaItem.url).into(thumb)

            videIndicator.visibility = when(mediaItem.type){
                Type.PHOTO -> View.INVISIBLE
                Type.VIDEO -> View.VISIBLE

            }

            itemView.setOnClickListener {
                toastView(mediaItem.title)
            }
        }
    }
}
