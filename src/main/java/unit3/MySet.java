package unit3;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);

        set.add(3);
        System.out.println(set);


        Set<Student> students = new HashSet<>();
        Student student1 = new Student(1L, "Vasya", "Pyplin", 20);
        Student student2 = new Student(2L, "Vasya", "Pyplin", 20);
        students.add(student1);
        students.add(student2);

        System.out.println(student1.equals(student2));

        System.out.println(students);
    }
}
