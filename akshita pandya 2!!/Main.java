
import java.util.Random;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " - " + artist;
    }
}

class Playlist {
    private Song[] songs;
    private int count;

    public Playlist(int size) {
        songs = new Song[size];
        count = 0;
    }

    public void addSong(Song s) {
        if (count < songs.length) {
            songs[count] = s;
            count++;
        } else {
            System.out.println("Playlist is full!");
        }
    }

    public void shufflePlaylist() {
        Random rand = new Random();

        for (int i = count - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            Song temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }
    }

    public void displayPlaylist() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + songs[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist(10);

        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Perfect", "Ed Sheeran"));
        playlist.addSong(new Song("Believer", "Imagine Dragons"));
        playlist.addSong(new Song("Levitating", "Dua Lipa"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));

        System.out.println("Original Playlist:");
        playlist.displayPlaylist();

        playlist.shufflePlaylist();

        System.out.println("\nShuffled Playlist:");
        playlist.displayPlaylist();
    }
}


//output

// Original Playlist:
// 1. Shape of You - Ed Sheeran
// 2. Perfect - Ed Sheeran
// 3. Believer - Imagine Dragons
// 4. Levitating - Dua Lipa
// 5. Blinding Lights - The Weeknd

// Shuffled Playlist:
// 1. Perfect - Ed Sheeran
// 2. Believer - Imagine Dragons
// 3. Shape of You - Ed Sheeran
// 4. Blinding Lights - The Weeknd
// 5. Levitating - Dua Lipa
