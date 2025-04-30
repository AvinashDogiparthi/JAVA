package AF_ClassesInDepth.F_POJOClass;

public class Student {

    int name;
    private int rollNumber;
    protected String address;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
