package com.example.vineetprasadverma.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_songs);

        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");
        songs.add("Addicted");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(EnglishSongsActivity.this , android.R.layout.simple_list_item_1 , songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
