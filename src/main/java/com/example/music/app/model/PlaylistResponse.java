package com.example.music.app.model;

import java.util.List;

public class PlaylistResponse {

    private String mood;
    private List<Song> songs;

    public PlaylistResponse(String mood, List<Song> songs) {
        this.mood = mood;
        this.songs = songs;
    }

    public String getMood() {
        return mood;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
