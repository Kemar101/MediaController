package com.example.kemar.mcontroller;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // referance to video viewer
        VideoView vView = findViewById(R.id.vview);

        // path to the video from raw file
        String vPath = "android.resource://" + getPackageName() + "/" + R.raw.infinitywar;

        // Represents a Uniform Resource Identifier (URI) reference for the string path
        Uri u = Uri.parse(vPath);
        vView.setVideoURI(u);

        // set the bar to play/pause video when click
        MediaController mc = new MediaController(this);
        vView.setMediaController(mc);

        // set position of media viewer
        mc.setAnchorView(vView);
    }
}