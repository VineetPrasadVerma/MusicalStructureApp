package com.example.vineetprasadverma.musicalstructureapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {
    public SongsAdapter(Activity context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_songs, parent, false);
        }

        // Get the object located at this position in the list
        Songs currentSong = getItem(position);

        //Get the song name from the current song
        TextView songName = listItemView.findViewById(R.id.song_name_text_view);
        songName.setText(currentSong.getSongsName());

        //Get the artist name from the current song
        TextView artistName = listItemView.findViewById(R.id.artist_name_text_view);
        artistName.setText(currentSong.getArtistName());

        return listItemView;
    }
}
