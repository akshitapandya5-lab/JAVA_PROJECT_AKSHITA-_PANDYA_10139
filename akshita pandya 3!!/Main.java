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
        return "Title: " + title + ", Artist: " + artist;
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
        Random random = new Random();

        for (int i = count - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            Song temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }
    }

    public void displayPlaylist() {
        System.out.println("\nPlaylist Queue:");

        // Enhanced For-Each Loop
        for (Song s : songs) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist(5);

        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Believer", "Imagine Dragons"));
        playlist.addSong(new Song("Levitating", "Dua Lipa"));
        playlist.addSong(new Song("Perfect", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));

        System.out.println("Original Playlist:");
        playlist.displayPlaylist();

        playlist.shufflePlaylist();

        System.out.println("\nShuffled Playlist:");
        playlist.displayPlaylist();
    }
}
           

// Original Playlist:

// Playlist Queue:
// Title: Shape of You, Artist: Ed Sheeran
// Title: Believer, Artist: Imagine Dragons
// Title: Levitating, Artist: Dua Lipa
// Title: Perfect, Artist: Ed Sheeran
// Title: Blinding Lights, Artist: The Weeknd

// Shuffled Playlist:

// Playlist Queue:
// Title: Shape of You, Artist: Ed Sheeran
// Title: Blinding Lights, Artist: The Weeknd
// Title: Believer, Artist: Imagine Dragons
// Title: Levitating, Artist: Dua Lipa
// Title: Perfect, Artist: Ed Sheeran
