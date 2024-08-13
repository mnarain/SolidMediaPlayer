package sr.qualogy.caribbean.services.impl;

import sr.qualogy.caribbean.models.Song;
import sr.qualogy.caribbean.services.MediaPlayerService;

import java.util.List;

public class MediaPlayerServiceImpl implements MediaPlayerService {
    private List<Song> playlist;

    public void play(Song song) {
        System.out.println("Playing: " + song);
    }

    @Override
    public void setPlaylist(List<Song> playlist) {
        this.playlist = playlist;
    }

    @Override
    public void displayPlaylist() {
        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}
