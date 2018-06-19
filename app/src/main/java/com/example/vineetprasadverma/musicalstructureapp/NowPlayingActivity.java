package com.example.vineetprasadverma.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Get the intent.
        Intent intent = getIntent();

        // Retrieving the info from the intent .
        String songName = intent.getStringExtra("Song Name");
        String artistName = intent.getStringExtra("Artist Name");
        int color = intent.getIntExtra("color Resource", 0);

        //find the view that shows the song name
        TextView songTextView = findViewById(R.id.now_playing_song_name);
        songTextView.setTextColor(color);
        songTextView.setText(songName);

        //find the view that shows the artist name.
        TextView artistTextView = findViewById(R.id.now_playing_artist_name);
        artistTextView.setTextColor(color);
        artistTextView.setText(artistName);

    }
}
