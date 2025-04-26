package AA_OOPS_Concepts.z_ObjectRelationShips.Aggregation;

public class Main {

    public static void main(String[] args) {

        // Even if department is destroyed, employee object can still exist.
        Employee e = new Employee("Avinash", 100);
        Department department = new Department("IT", e);

        department.showDetails();
    }
}
