package com.example.music.app.controller;

import com.example.music.app.model.PlaylistResponse;
import com.example.music.app.service.PlaylistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping("/playlist/{mood}")
    public PlaylistResponse getPlaylist(@PathVariable String mood) {
        return playlistService.getPlaylist(mood);
    }
}
