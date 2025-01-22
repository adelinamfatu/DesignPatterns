package structural.aggregate;

//Imaginați-vă că într-o școală, avem o clasă (de exemplu, o clasă de matematică) care conține mai mulți elevi.
//În acest caz, clasa principală va fi Class, iar fiecare elev va avea informații asociate (nume, vârstă, notele obținute),
//care sunt private și accesibile doar prin getter-i. Vom folosi design patternul Aggregate pentru a reprezenta
//o colecție de obiecte (elevi) într-o clasă (Class).

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ana", 15, 9.5);
        Student student2 = new Student("Mihai", 16, 8.3);
        Student student3 = new Student("Maria", 14, 10.0);

        //Creare obiect Class
        Class mathClass = new Class();
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);

        //Afisare informatii studenti
        for (Student student : mathClass.getStudents()) {
            System.out.println("Nume: " + student.getName() + ", Vârstă: " + student.getAge() + ", Notă: " + student.getGrade());
        }

        //Obtinere obiect specific
        Student selectedStudent = mathClass.getStudent(1);
        if (selectedStudent != null) {
            System.out.println("Elevul selectat: " + selectedStudent.getName());
        }
    }
}
