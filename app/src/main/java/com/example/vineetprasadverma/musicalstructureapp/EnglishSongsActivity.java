package com.example.vineetprasadverma.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Creates the list of songs.
        ArrayList<Songs> songs= new ArrayList<Songs>();
        songs.add(new Songs("Addicted","Enrique Iglesios"));
        songs.add(new Songs("Shape of You","Ed Sheeran"));
        songs.add(new Songs("Sorry","Justin Bieber"));
        songs.add(new Songs("Closer","Chain Smokers"));
        songs.add(new Songs("Let Me Love You","DJ Snake"));
        songs.add(new Songs("Cheap Thrills","Sia"));
        songs.add(new Songs("Sugar","Maroon"));
        songs.add(new Songs("Despacito","Luis Fonsi,Daddy Yankee"));
        songs.add(new Songs("My Heart Will Go On","Celine Dion"));
        songs.add(new Songs("See You Again","Wiz Khalifa"));
        songs.add(new Songs("Whta Do you mean","Lustin Bieber"));

        //Creates a Song adapter whose data source is a list of the songs.The adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(EnglishSongsActivity.this, songs);

        //finds the object in the view hierarchy of the Activity.There should be a view with a view id list.
        ListView listView = findViewById(R.id.list);

        //Attach the adapter to the listview.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            }
        });



    }
}
