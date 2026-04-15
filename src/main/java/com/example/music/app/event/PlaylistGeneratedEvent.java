package com.example.music.app.event;

import org.springframework.context.ApplicationEvent;

public class PlaylistGeneratedEvent extends ApplicationEvent {

    private final String mood;

    public PlaylistGeneratedEvent(Object source, String mood) {
        super(source);
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
