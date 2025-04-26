package AA_OOPS_Concepts.z_ObjectRelationShips.Composition;

public class House {

    private Room room;

    House(String roomName){
        // Composition
        // Room is created inside House
        this.room = new Room(roomName);
    }

    void showDetails(){
        System.out.println("House Details:");
        room.showDetails();
    }
}
