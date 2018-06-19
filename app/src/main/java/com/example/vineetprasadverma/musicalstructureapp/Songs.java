package com.example.vineetprasadverma.musicalstructureapp;

public class Songs {

    /**
     * Song name for the song
     */
    private String mSongName;

    /**
     * Artist name for the song
     */
    private String mArtistName;

    /**
     * Create a new Song object
     *
     * @param songName   is the name of the song.
     * @param artistName is the name of the artist.
     */
    public Songs(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Get the song name for the song
     */
    public String getSongsName() {
        return mSongName;
    }

    /**
     * Get the artist name for the song
     */
    public String getArtistName() {
        return mArtistName;
    }
}
