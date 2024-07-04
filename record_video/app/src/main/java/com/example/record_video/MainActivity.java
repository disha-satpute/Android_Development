package com.example.record_video;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
public class MainActivity extends Activity {
    private static final int CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE = 10;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startCamera(View view)
    {
        //create Intent to record video and return it to the calling application
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        //start the video capture Intent
        startActivityForResult(intent, CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                //display the video in VideoView
                VideoView videoView=(VideoView)findViewById(R.id.videoView);
                //get video uri
                Uri videoUri=data.getData();
                //set the video uri to VideoView
                videoView.setVideoURI(videoUri);
                //set media controller allowing you to play, pause, and move the video forward and backward
                videoView.setMediaController(new MediaController(this));
                //play the video
                videoView.start();
            } else if (resultCode == RESULT_CANCELED) {
                // User cancelled the video capture
            } else {
                // video capture failed
            }
        }
    }
}


