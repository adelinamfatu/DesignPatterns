package structural.composite;

import java.util.ArrayList;
import java.util.List;

//Clasa Composite ce implementeaza interfata Component
//Are o lista de noduri fiu
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Directory Name: " + name);
        for (FileSystemComponent component : children) {
            component.displayInfo();
        }
    }
}
