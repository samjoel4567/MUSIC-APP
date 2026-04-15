package com.example.music.app.strategy;

import com.example.music.app.model.Song;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("happy")
public class HappyStrategy implements RecommendationStrategy {

    @Override
    public List<Song> getSongs() {
        return Arrays.asList(
            new Song("Happy - Pharrell Williams", "ZbZSe6N_BXs"),
            new Song("Can't Stop the Feeling! - Justin Timberlake", "ru0K8uYEZWw"),
            new Song("Uptown Funk - Mark Ronson ft. Bruno Mars", "OPf0YbXqDm0")
        );
    }
}
