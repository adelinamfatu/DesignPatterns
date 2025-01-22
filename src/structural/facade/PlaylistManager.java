package structural.facade;

//Subsistem 3
public class PlaylistManager {
    public void addToPlaylist(String fileName) {
        System.out.println("Adding " + fileName + " to playlist.");
    }

    public void showPlaylist() {
        System.out.println("Displaying current playlist...");
    }
}
