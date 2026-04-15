package com.example.music.app.strategy;

import com.example.music.app.model.Song;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("focus")
public class FocusStrategy implements RecommendationStrategy {

    @Override
    public List<Song> getSongs() {
        return Arrays.asList(
            new Song("Lo-fi Study Beats", "5qap5aO4i9A"),
            new Song("Deep Focus Music", "DWcJFNfaw9c"),
            new Song("Peaceful Piano", "4Tr0otuiQuU")
        );
    }
}
