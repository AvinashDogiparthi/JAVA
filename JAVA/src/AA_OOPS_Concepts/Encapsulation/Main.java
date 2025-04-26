package AA_OOPS_Concepts.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Avinash Dogiparthi");
        student.setAge(22);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

    }
}
