// Song class
class Song {
    String title;
    String artist;

    // constructor
    Song(String t, String a) {
        title = t;
        artist = a;
    }
}

// Main class
public class main {
    public static void main(String[] args) {

        // create array of songs
        Song[] playlist = new Song[3];

        // add songs
        playlist[0] = new Song("Believer", "Imagine Dragons");
        playlist[1] = new Song("Shape of You", "Ed Sheeran");
        playlist[2] = new Song("Blinding Lights", "The Weeknd");

        // display playlist
        System.out.println("Playlist:");
        for (int i = 0; i < playlist.length; i++) {
            System.out.println((i + 1) + ". " +
                    playlist[i].title + " - " +
                    playlist[i].artist);
        }
    }
}


//OUTPUT
// Playlist:
// 1. Believer - Imagine Dragons
// 2. Shape of You - Ed Sheeran
// 3. Blinding Lights - The Weeknd