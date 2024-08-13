package sr.qualogy.caribbean.services;

import sr.qualogy.caribbean.models.Song;

import java.util.List;

public interface MediaPlayerService {
    void play(Song song);

    void setPlaylist(List<Song> playlist);

    void displayPlaylist();
}
