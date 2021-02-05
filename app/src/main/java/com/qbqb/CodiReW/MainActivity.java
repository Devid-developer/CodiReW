package com.qbqb.CodiReW;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    VideoView vvtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        vvtitle = (VideoView)findViewById(R.id.videoView);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.title);
        vvtitle.setVideoURI(video);
        vvtitle.setOnCompletionListener(mp -> {
            if(isFinishing())
                return ;

            startActivity(new Intent(MainActivity.this, MenuActivity.class));
            finish();
        });
    vvtitle.start();
    }

}