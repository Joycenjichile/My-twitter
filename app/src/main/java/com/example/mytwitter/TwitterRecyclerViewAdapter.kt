package com.example.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRecyclerViewAdapter (var twitterList: List<Twitter>):
    RecyclerView.Adapter<TwitterViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
            var itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.tweeter_list_item, parent, false)
            var twitterViewHolder  = TwitterViewHolder(itemView)
            return TwitterViewHolder(itemView)

        }

        override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
            var currentTwitter = twitterList.get(position)
            holder.tvName.text = currentTwitter.name
            holder.tvDisplay.text = currentTwitter.handle
            holder.tvTweet.text = currentTwitter.tweet
            holder.tvOne.text = currentTwitter.retweet
            holder.tvTwo.text=currentTwitter.reply
            holder.tvThree.text=currentTwitter.likes




        }

        override fun getItemCount(): Int {
            return twitterList.size
        }
    }

    class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var tvDisplay= itemView.findViewById<TextView>(R.id.tvDisplay)
        var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
        var tvOne= itemView.findViewById<TextView>(R.id.tvOne)
        var tvTwo= itemView.findViewById<TextView>(R.id.tvTwo)
        var tvThree= itemView.findViewById<TextView>(R.id.tvThree)
        var ivImage = itemView.findViewById<ImageView>(R.id.ivImage)



    }



