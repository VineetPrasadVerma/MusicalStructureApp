package com.example.vineetprasadverma.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BhojpuriSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create a list of songs
        final ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Kariya Rashgulla", "Khesari Lal Yadav"));
        songs.add(new Songs("Chumma se Khaali Jhum", "Chote Baba"));
        songs.add(new Songs("Lagelu Hunari Munari", "Pawan Singh"));
        songs.add(new Songs("Filter ke Pani", "Arvind Akela Kallji"));
        songs.add(new Songs("Lachke Kamariya Tohar", "Khesari Lal Yadav"));
        songs.add(new Songs("Cooler Kurti me Lagela", "Indu Sonali"));
        songs.add(new Songs("PandeyJi ka Beta Hoon", "Ritesh Pandey"));
        songs.add(new Songs("Lolipop Lagelu", "Manoj Kumar"));
        songs.add(new Songs("Are Dj Wale Bhai", "Khesari Lal Yadav"));
        songs.add(new Songs("Bhatar Khali Ban Jaye", "Arvind Akela Kallji"));
        songs.add(new Songs("Dhaka Kohariya me Balama", "Khesari Lal Yadav"));

        //Creates a Song adapter whose data source is a list of the songs.The adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(BhojpuriSongsActivity.this, songs);

        //finds the object in the view hierarchy of the Activity.There should be a view with a view id list.
        ListView listView = findViewById(R.id.list);

        //Attach the adapter to the listview.
        listView.setAdapter(adapter);

        //Set a click Listener to open new activity when list items are clicked.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                //Get the object at the given position
                Songs song = songs.get(position);

                //To open new activity
                Intent nowPlayingIntent = new Intent(BhojpuriSongsActivity.this, NowPlayingActivity.class);

                //passing extra information to the now playing activity.
                nowPlayingIntent.putExtra("Song Name", song.getSongsName());
                nowPlayingIntent.putExtra("Artist Name", song.getArtistName());
                nowPlayingIntent.putExtra("color Resource", getResources().getColor(R.color.category_bhojpuri_songs));

                startActivity(nowPlayingIntent);
            }
        });

    }
}
