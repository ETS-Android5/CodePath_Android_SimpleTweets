package com.codepath.apps.restclienttemplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.codepath.apps.restclienttemplate.models.Tweet
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

private var TAG = "ComposeActivity"
class ComposeActivity : AppCompatActivity() {

    lateinit var etCompose: EditText
    lateinit var btnTweet: Button

    lateinit var client: TwitterClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compose)

        etCompose = findViewById(R.id.etCompose)
        btnTweet = findViewById(R.id.btnTweet)

        client = TwitterApplication.getRestClient(this)

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
                // Make an API call to Twitter to publish Tweet
                client.publishTweet(tweetContent, object: JsonHttpResponseHandler() {
                    override fun onFailure(
                        statusCode: Int,
                        headers: Headers?,
                        response: String?,
                        throwable: Throwable?
                    ) {
                        Log.e(TAG, "Failed to publish Tweet", throwable)
                    }

                    override fun onSuccess(statusCode: Int, headers: Headers?, json: JSON) {
                        // Send the Tweet back to TimelineActivity to show
                        Log.i(TAG, "Successfully published Tweet")

                        val tweet = Tweet.fromJson(json.jsonObject)

                        val i = Intent()
                        i.putExtra("tweet", tweet)
                        setResult(RESULT_OK, i)
                        finish()
                    }

                })

            }
        }
    }
}