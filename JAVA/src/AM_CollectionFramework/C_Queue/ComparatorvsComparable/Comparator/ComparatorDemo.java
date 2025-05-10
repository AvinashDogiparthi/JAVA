package AM_CollectionFramework.C_Queue.ComparatorvsComparable.Comparator;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Avinash", 90));
        students.add(new Student("Vamshi", 99));
        students.add(new Student("Arpit", 80));

        // Sort by name (alphabetical)
        Collections.sort(students, Comparator.comparing(s -> s.name));
        System.out.println("Sorted by name: " + students);

        // Sort by marks (descending)
        Collections.sort(students, Comparator.comparingInt(s -> -s.marks));
        System.out.println("Sorted by marks (descending): " + students);
    }
}

