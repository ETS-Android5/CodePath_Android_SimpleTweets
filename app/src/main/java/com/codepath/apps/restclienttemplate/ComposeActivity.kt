package com.codepath.apps.restclienttemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ComposeActivity : AppCompatActivity() {

    lateinit var etCompose: EditText
    lateinit var btnTweet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compose)

        etCompose = findViewById(R.id.etCompose)
        btnTweet = findViewById(R.id.btnTweet)

        // Handle user's click on Tweet button
        btnTweet.setOnClickListener {
            // Grab the content of etCompose
            val tweetContent = etCompose.text.toString()

            // 1. Verify Tweet isn't empty
            if (tweetContent.isEmpty()) {
                Toast.makeText(this, "Empty Tweets are not allowed!", Toast.LENGTH_SHORT).show()
            }

            // 2. Verify Tweet is under character count
            else if (tweetContent.length > 140) {
                Toast.makeText(this, "Tweet is too long! Limit is 140 characters.", Toast.LENGTH_SHORT).show()
            }
            else {
                // TODO: Make an API call to Twitter to publish tweet
                Toast.makeText(this, tweetContent, Toast.LENGTH_SHORT).show()
            }
        }
    }
}