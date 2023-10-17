package com.example.videoandroidappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView myvideo = findViewById(R.id.videoOne);

        String video = "android.resource://" + getPackageName() + "/" + R.raw.duck;
        Uri uri = Uri.parse(video);

        myvideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
    }
}