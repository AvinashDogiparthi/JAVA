package AA_OOPS_Concepts.Encapsulation;

public class Student {

    // Step 1: Private fields
    private String name;
    private int age;


    // Step 2: Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Only allow age if it's a positive number
        if(age > 0) {
            this.age = age;
        }
    }
}
