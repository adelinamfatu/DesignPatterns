package structural.facade;

//Clasa Facade
//Are proprietati de tipul fiecarui subsistem
//Gestioneaza fiecare operatie
public class MusicFacade {
    private AudioFile audioFile;
    private AudioPlayer audioPlayer;
    private PlaylistManager playlistManager;

    public MusicFacade() {
        audioPlayer = new AudioPlayer();
        playlistManager = new PlaylistManager();
    }

    public void playSong(String fileName) {
        audioFile = new AudioFile(fileName);
        audioFile.loadFile();
        playlistManager.addToPlaylist(fileName);
        audioPlayer.play(fileName);
    }

    public void stopSong() {
        audioPlayer.stop();
    }

    public void showPlaylist() {
        playlistManager.showPlaylist();
    }
}
