package com.example.recyclerviewapp

import android.os.Message
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class MessageAdapter( private val messages:ArrayList<String>): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>(){


    class MessageViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
       return MessageViewHolder(
           LayoutInflater.from(parent.context).inflate(
               R.layout.item_row,
               parent,
               false
           )
       )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
       val  message = messages[position]
        holder.itemView.apply {
            tvMessage.text = message
    }}

    override fun getItemCount() = messages.size
    }


