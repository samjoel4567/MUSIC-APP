package com.example.music.app.listener;

import com.example.music.app.event.PlaylistGeneratedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PlaylistNotificationListener {

    @EventListener
    public void handlePlaylistGenerated(PlaylistGeneratedEvent event) {
        System.out.println("Playlist generated for mood: " + event.getMood());
    }
}
