package com.example.videoapp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    SurfaceView surfaceView;
    SurfaceView surfaceView2;
    Button player1;
    Button player2;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surfaceView = findViewById(R.id.surfaceView);
        surfaceView2 = findViewById(R.id.surfaceView2);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        mediaPlayer = MediaPlayer.create(this,R.raw.vid);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.vid1);
        surfaceView.setKeepScreenOn(true);
        surfaceView2.setKeepScreenOn(true);
        SurfaceHolder h = surfaceView.getHolder();
        SurfaceHolder h1 = surfaceView2.getHolder();
        h.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                mediaPlayer.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

            }
        });
        h1.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                mediaPlayer2.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

            }
        });
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    mediaPlayer2.start();
                    player1.setText("Play");
                    player2.setText("Pause");
                }
                else {
                    mediaPlayer.start();
                    mediaPlayer2.pause();
                    player1.setText("Pause");
                    player2.setText("Play");
                }
            }
        });
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                    mediaPlayer.start();
                    player1.setText("Pause");
                    player2.setText("Play");
                }
                else {
                    mediaPlayer2.start();
                    mediaPlayer.pause();
                    player1.setText("Play");
                    player2.setText("Pause");
                }
            }
        });
        mediaPlayer.start();
//        mediaPlayer2.start();
    }
}