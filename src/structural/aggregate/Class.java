package structural.aggregate;

import java.util.ArrayList;
import java.util.List;

//Clasa Class ce contine un membru al clasei ClassData
//Membrul este initializat in constructorul clasei principale
public class Class {
    private List<Student> students;

    public Class() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return null;
    }
}
