package structural.composite;

//Se dorește dezvoltarea unui sistem care să reprezinte o structură de fișiere și directoare,
//unde fiecare fișier și director sunt tratate ca obiecte, iar directoarele pot conține fișiere sau alte directoare.
//Atât fișierele, cât și directoarele trebuie să implementeze aceleași operații (de exemplu, afisarea informațiilor),
//dar directoarele pot conține alte fișiere sau directoare, iar fișierele nu pot conține alte obiecte.

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt", 100);
        FileSystemComponent file2 = new File("File2.txt", 200);
        FileSystemComponent file3 = new File("File3.txt", 300);

        //Creare director
        Directory directory1 = new Directory("Documents");
        directory1.add(file1);
        directory1.add(file2);

        Directory directory2 = new Directory("Projects");
        directory2.add(file3);
        directory2.add(directory1);  //Adaugare director in alt director

        directory2.displayInfo();
    }
}
