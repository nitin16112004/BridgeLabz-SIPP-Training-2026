import java.util.*;

public class MusicPlaylist {

    static LinkedList<String> playlist = new LinkedList<>();

    public static void playSong(String song) {

        playlist.addFirst(song);

        if (playlist.size() > 10) {
            String removedSong = playlist.removeLast();
            System.out.println("Removed Oldest Song: " + removedSong);
        }

        System.out.println(song + " is now playing.");
    }

   
    public static void searchSong(String song) {

        if (playlist.contains(song)) {
            System.out.println(song + " is present in Recently Played.");
        } else {
            System.out.println(song + " is not found.");
        }
    }

    public static void displayPlaylist() {

        if (playlist.isEmpty()) {
            System.out.println("No songs played yet.");
            return;
        }

        System.out.println("\nRecently Played Songs:");

        for (String song : playlist) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {

        playSong("Believer");
        playSong("Shape of You");
        playSong("Perfect");
        playSong("Senorita");
        playSong("Levitating");
        playSong("Closer");
        playSong("Faded");
        playSong("Attention");
        playSong("Memories");
        playSong("Thunder");
        playSong("Heat Waves"); 

        System.out.println();

        searchSong("Perfect");
        searchSong("Believer");

        displayPlaylist();
    }
}