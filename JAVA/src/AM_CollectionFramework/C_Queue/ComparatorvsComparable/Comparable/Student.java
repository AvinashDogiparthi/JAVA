package AM_CollectionFramework.C_Queue.ComparatorvsComparable.Comparable;

public class Student implements Comparable<Student>{
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student{name = '" +name+"', marks="+marks+"}";
    }

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks; // Ascending order of marks
    }
}
