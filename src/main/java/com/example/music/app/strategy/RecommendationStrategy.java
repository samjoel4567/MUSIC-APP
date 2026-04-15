package com.example.music.app.strategy;

import com.example.music.app.model.Song;
import java.util.List;

public interface RecommendationStrategy {
    List<Song> getSongs();
}
