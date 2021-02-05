package com.qbqb.CodiReW;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity  extends AppCompatActivity {

    Button btnWrite;
    Button btnDecode;
    Button btnExit;
    VideoView vvtitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_menu);

        vvtitle = (VideoView)findViewById(R.id.videoView2);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.title);
        vvtitle.setVideoURI(video);
        vvtitle.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if(isFinishing())
                    return;
                vvtitle.start();
            }
        });
        vvtitle.start();

        btnWrite = (Button)findViewById(R.id.btnWrite);
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ScriviActivity.class));
            }
        });

        btnDecode = (Button)findViewById((R.id.btnDecode));
        btnDecode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, DecodeActivity.class));
            }
        });

        btnExit = (Button) findViewById(R.id.btnEsci);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

}

    //funzioni

