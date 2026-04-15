package com.example.music.app.strategy;

import com.example.music.app.model.Song;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("sad")
public class SadStrategy implements RecommendationStrategy {

    @Override
    public List<Song> getSongs() {
        return Arrays.asList(
            new Song("Someone Like You - Adele", "hLQl3WQQoQ0"),
            new Song("Let Her Go - Passenger", "RBumgq5yVrA"),
            new Song("Fix You - Coldplay", "k4V3Mo61fJM")
        );
    }
}
