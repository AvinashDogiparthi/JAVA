package AA_OOPS_Concepts.z_ObjectRelationShips.Composition;

public class Room {

    private String roomName;

    Room(String roomName){
        this.roomName = roomName;
    }

    void showDetails(){
        System.out.println("Room Name: " + roomName);
    }
}
