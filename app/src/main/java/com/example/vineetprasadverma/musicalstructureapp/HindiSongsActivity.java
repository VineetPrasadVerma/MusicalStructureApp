package com.example.vineetprasadverma.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create a list of songs
        ArrayList<Songs> songs= new ArrayList<Songs>();
        songs.add(new Songs("Tum Hi Ho","Arijit Singh"));
        songs.add(new Songs("Dil Diya Gallan","Atif Aslam"));
        songs.add(new Songs("Mere Rashke Qamar","Rahat Fateh Ali Khan"));
        songs.add(new Songs("Soch Na Sake","Tulsi Kumar"));
        songs.add(new Songs("Baarish","Shasah Tripati , Ash King"));
        songs.add(new Songs("Zara Zara","Bombay Jayashri"));
        songs.add(new Songs("O Saathi ","Atif Aslam"));
        songs.add(new Songs("Ek Ajnabee Hasina Se","Kishore kumar"));
        songs.add(new Songs("Muskurane","Arijit Singh"));
        songs.add(new Songs("Samjhawan","Shreya Ghosal"));
        songs.add(new Songs("Aaj Se Teri","Arijit Singh"));

        //Creates a Song adapter whose data source is a list of the songs.The adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(HindiSongsActivity.this, songs);

        //finds the object in the view hierarchy of the Activity.There should be a view with a view id list.
        ListView listView = findViewById(R.id.list);

        //set the adapter on the listview.
        listView.setAdapter(adapter);

    }
}
