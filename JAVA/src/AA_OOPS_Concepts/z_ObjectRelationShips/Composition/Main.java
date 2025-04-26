package AA_OOPS_Concepts.z_ObjectRelationShips.Composition;

public class Main {

    public static void main(String[] args) {

        // Room cannot exist without a house
        // When house is destroyed, its room object is destroyed too.
        House house = new House("Living Room");
        house.showDetails();
    }
}
