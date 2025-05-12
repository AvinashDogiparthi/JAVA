package AM_CollectionFramework.C_Queue.ComparatorvsComparable.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 95));
        students.add(new Student("David", 85));

        // Sorting using Comparable (Natural Order)
        Collections.sort(students);
        System.out.println("Students sorted by marks (Ascending):");
        System.out.println(students);
    }
}
