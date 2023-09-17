package com.amipatel.mad_practical_7_21012011065
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" +R.raw.thestoryoflight)
        val myVideoView= findViewById<VideoView>(R.id.videoView)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()
        val button:FloatingActionButton = findViewById(R.id.floatingActionButton)
        button.setOnClickListener {
            Intent(this,YouTubeActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}