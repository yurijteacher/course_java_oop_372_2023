package unit3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        for (Integer el : list) {
            System.out.println(el);
        }

        list.stream().forEach(e->{System.out.println(e);});

        list.stream().forEach(System.out::println);

        list.add(5);

        list.set(0,5);

        list.add(0,10);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        System.out.println(list.get(1));

        list.clear();

        System.out.println(list);

        List<Student> students = new ArrayList<>();

        students.add(new Student(1L, "Vasya", "Pypkin", 19));
        students.add(new Student(2L, "Ivanna", "Pypkina", 20));
        students.add(new Student(3L, "Iva", "Kds", 16));
        students.add(new Student(4L, "Ivan", "Fsd", 121));

        System.out.println(students);

        List<Student> studentListSortedByAge = students
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());

        System.out.println(studentListSortedByAge);

        Student studentMinAge = students.stream().min(Comparator.comparing(Student::getAge)).get();

        System.out.println(studentMinAge);

        String LastNameStudentByMaxAge = students.stream().max(Comparator.comparing(Student::getAge)).get().getLastName();

        System.out.println(LastNameStudentByMaxAge);

        students.stream().filter(el->(el.getAge()>16)).forEach(System.out::print);

    }
}
