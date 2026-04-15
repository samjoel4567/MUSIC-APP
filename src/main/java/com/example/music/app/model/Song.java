package com.example.music.app.model;

public class Song {

    private String title;
    private String videoId;

    public Song(String title, String videoId) {
        this.title = title;
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
