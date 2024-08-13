package sr.qualogy.caribbean.models;

import java.util.Random;

public class Song {
    private String referenceNumber;
    private String title;
    private String artist;
    private String path;

    public Song(String title, String artist, String path) {
        this.title = title;
        this.artist = artist;
        this.path = path;
        this.referenceNumber = generateReferenceNumber();
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Song{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    private static String generateReferenceNumber() {
        int length = 6;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder referenceNumber = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            referenceNumber.append(characters.charAt(random.nextInt(characters.length())));
        }
        return referenceNumber.toString();
    }
}
