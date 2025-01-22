package structural.facade;

//O bibliotecă de muzică oferă o interfață complexă pentru gestionarea și redarea melodiilor.
//Bibliotecile existente (Subsystem) includ clase pentru gestionarea fișierelor audio, redare,
//afișarea informațiilor despre melodii și gestionarea playlisturilor,
//însă aceste clase sunt greu de utilizat direct pentru utilizatorii obișnuiți.

public class Main {
    public static void main(String[] args) {
        MusicFacade musicFacade = new MusicFacade();

        musicFacade.playSong("song1.mp3");

        musicFacade.showPlaylist();

        musicFacade.stopSong();
    }
}
