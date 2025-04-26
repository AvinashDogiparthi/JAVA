package AA_OOPS_Concepts.z_ObjectRelationShips.Aggregation;

public class Department {
    String deptName;
    Employee employee; // Aggregation

    public Department(String deptName, Employee employee) {
        this.deptName = deptName;
        this.employee = employee;
    }

    void showDetails(){
        System.out.println("Department Name: " + deptName);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee ID: " + employee.id);
    }
}
