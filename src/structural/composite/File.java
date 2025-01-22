package structural.composite;

//Clasa Leaf - structura arborescenta cea mai de jos ce implementeaza interfata Component
public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("File Name: " + name + ", Size: " + size + "KB");
    }
}
