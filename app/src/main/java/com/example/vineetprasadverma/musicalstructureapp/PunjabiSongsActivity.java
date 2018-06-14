package com.example.vineetprasadverma.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PunjabiSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Creates the list of songs
        ArrayList<Songs> songs= new ArrayList<Songs>();
        songs.add(new Songs("BackBone","Hardy Sandhu"));
        songs.add(new Songs("Lahore","Guru Randhawa"));
        songs.add(new Songs("Tenu Suit Suit karda","Guru Randhawa"));
        songs.add(new Songs("3 Peg","Sherry Maan"));
        songs.add(new Songs("High Rated Gabru","Guru Randhawa"));
        songs.add(new Songs("Qismat","Ammy Virk"));
        songs.add(new Songs("Trending Nakhra","Amrit Maan"));
        songs.add(new Songs("Dooriya","Guri"));
        songs.add(new Songs("Daaru Badnaam","Param Singh"));
        songs.add(new Songs("Shada","Parmish Verma"));
        songs.add(new Songs("Blue Eyes","Yo Yo Honey Singh"));

        //Creates a Song adapter whose data source is a list of the songs.The adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(PunjabiSongsActivity.this, songs);

        //finds the object in the view hierarchy of the Activity.There should be a view with a view id list.
        ListView listView = findViewById(R.id.list);

        //set a adapter on the listview.
        listView.setAdapter(adapter);

    }
}
