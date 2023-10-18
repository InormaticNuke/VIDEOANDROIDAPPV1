package com.example.videoandroidappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView myvideo = findViewById(R.id.videoOne);

        String video = "android.resource://" + getPackageName() + "/" + R.raw.flashlight;
        Uri uri = Uri.parse(video);

        myvideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        myvideo.setMediaController(mediaController);
        mediaController.setAnchorView(myvideo);

        Animation animation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        myvideo.startAnimation(animation);

        myvideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                myvideo.start();
            }
        });

    }
}