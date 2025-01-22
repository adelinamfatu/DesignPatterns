package structural.facade;

//Subsistem 1
public class AudioFile {
    private String fileName;

    public AudioFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void loadFile() {
        System.out.println("Loading audio file: " + fileName);
    }
}
