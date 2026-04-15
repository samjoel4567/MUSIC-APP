package com.example.music.app.service;

import com.example.music.app.event.PlaylistGeneratedEvent;
import com.example.music.app.model.PlaylistResponse;
import com.example.music.app.model.Song;
import com.example.music.app.strategy.FocusStrategy;
import com.example.music.app.strategy.HappyStrategy;
import com.example.music.app.strategy.RecommendationStrategy;
import com.example.music.app.strategy.SadStrategy;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    private final HappyStrategy happyStrategy;
    private final SadStrategy sadStrategy;
    private final FocusStrategy focusStrategy;
    private final ApplicationEventPublisher eventPublisher;

    public PlaylistService(HappyStrategy happyStrategy,
                           SadStrategy sadStrategy,
                           FocusStrategy focusStrategy,
                           ApplicationEventPublisher eventPublisher) {
        this.happyStrategy = happyStrategy;
        this.sadStrategy = sadStrategy;
        this.focusStrategy = focusStrategy;
        this.eventPublisher = eventPublisher;
    }

    public PlaylistResponse getPlaylist(String mood) {
        RecommendationStrategy strategy;
        
        switch (mood.toLowerCase()) {
            case "happy":
                strategy = happyStrategy;
                break;
            case "sad":
                strategy = sadStrategy;
                break;
            case "focus":
                strategy = focusStrategy;
                break;
            default:
                throw new RuntimeException("Invalid mood: " + mood);
        }

        List<Song> songs = strategy.getSongs();

        // Trigger event (Observer pattern)
        eventPublisher.publishEvent(new PlaylistGeneratedEvent(this, mood));

        return new PlaylistResponse(mood, songs);
    }
}
