package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        System.out.println("This is already in the playlist!");
        return false;
    }

    private Song findSong(String title) {

        for (Song mySong : songs) {
            if(mySong.getTitle().equals(title)) {
                return mySong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        int counter = trackNumber - 1;
        if ((counter >= 0) && (counter <= songs.size())) {
            playList.add(songs.get(counter));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {

        Song mySong = findSong(title);
        if (mySong != null) {
            playList.add(mySong);
            return true;
        }
        return false;
    }
}