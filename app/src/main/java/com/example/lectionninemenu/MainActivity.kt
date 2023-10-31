package com.example.lectionninemenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewLabel:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewLabel = findViewById<TextView>(R.id.textView)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val itemId:Int = item.itemId;
        if (itemId == R.id.first)
            textViewLabel.text = "First"
        if (itemId == R.id.second)
            textViewLabel.text = "Second"
        if (itemId == R.id.third)
            textViewLabel.text = "Third"

        return super.onOptionsItemSelected(item)
    }
}