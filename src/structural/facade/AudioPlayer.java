package structural.facade;

//Subsistem 2
public class AudioPlayer {
    public void play(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }

    public void stop() {
        System.out.println("Stopping audio playback.");
    }
}
