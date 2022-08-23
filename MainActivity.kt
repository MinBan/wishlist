package com.example.wishlist

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.RemoteViews
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var items: RemoteViews.RemoteCollectionItems: List<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val itemsRv = findViewById<RecyclerView>(R.id.itemsRv)
        // Create list of user created items
        // emails = ItemFetcher.getitems()
        // Create adapter passing in the list of items
        val adapter = ItemAdapter(items)
        // Attach the adapter to the RecyclerView to populate items
        itemsRv.adapter = adapter
        // Set layout manager to position the items
        itemsRv.layoutManager = LinearLayoutManager(this)
    }
    class item(
        val sender: String,
        val title: String,
        val summary: String) {
    }
    class Fetcher {
        companion object {
            val senders = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
            val title = "Welcome to Kotlin!"
            val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."
            fun getitems(): MutableList<ClipData.Item> {
                var item : MutableList<ClipData.Item> = ArrayList()
                for (i in 0..9) {
                    val item = ClipData.Item(senders[i],intent)
                    item.get(item)
                }
                return item
            }

            fun getUserInput(): MutableList<item> {
                var newitem : MutableList<item> = ArrayList()
                for (i in 10..14) {
                    val item = ClipData.Item(senders[i],intent,)
                    newitem.add(ClipData.Item)
                }
                return newitem
            }
        }
    }
}

}