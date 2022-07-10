package com.example.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()
    }
    fun displayTweet(){
        var twitter1=Twitter("Joyce Nkimalantoi","@nkimalantoi","God is my everything","","20","300","700",)
        var tweeter2=Twitter("Vincent Otieno","@otieno","i like novels","","5","40","500",)
        var tweeter3=Twitter("Sepeko","@sepeko","i like drama","","4","300","800",)
        var tweeter4=Twitter("Akuot","@akuot","i like dancing","","40","300","400",)
        var tweeter5=Twitter("Effence","@effence","i like socializing","","20","60","600",)
        var tweeter6=Twitter("Abonyo","@abonyo","i like reading","","600","300","500",)
        var tweeter7=Twitter("Gerald","@Gerald","i like counselling","","400","40","200",)
        var tweeter8=Twitter("Wadi","@wadi","i like travelling","","40","50","300",)
        var tweeter9=Twitter("Sintamei","@sinta","i like eating","","40","100","200",)
        var tweeter10=Twitter("Abigael","@abby","i like playing","","20","28","90",)
        var tweeter11=Twitter("Ruth","@ruth","i like swimming","","300","50","30",)


        var TwitterList=
            listOf(twitter1,tweeter2,tweeter3,tweeter4,tweeter5,tweeter6,tweeter7,tweeter8,tweeter9,tweeter10,tweeter11)
        var twitterAdapter=TwitterRecyclerViewAdapter(TwitterList)
        binding.rvTwitter.layoutManager= LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter

    }
}