package sr.qualogy.caribbean.app;

import sr.qualogy.caribbean.models.Song;
import sr.qualogy.caribbean.services.MediaPlayerService;
import sr.qualogy.caribbean.services.impl.MediaPlayerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        MediaPlayerService mps = new MediaPlayerServiceImpl();
        List<Song> playlistOne = new ArrayList<>();
        playlistOne.add(new Song("Not Like Us", "Kendrick Lamar", "Path 1"));
        playlistOne.add(new Song("Oe bar deng", "Kapalani", "Path 2"));
        playlistOne.add(new Song("Espresso", "Sabrina Carpenter", "Path 3"));

        mps.setPlaylist(playlistOne);
        mps.displayPlaylist();
        mps.play(playlistOne.get(1));


        List<Song> playlistTwo = new ArrayList<>();
        playlistTwo.add(new Song("Hit and run", "Senshia", "Path 4"));
        playlistTwo.add(new Song("Summer", "Vybz Kartel", "Path 5"));
        playlistTwo.add(new Song("Sorry", "Justin Bieber", "Path 6"));
        mps.setPlaylist(playlistTwo);
        mps.displayPlaylist();

        mps.play(playlistOne.get(2));

    }
}
