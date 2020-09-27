import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String roomName;
    ArrayList<Equipment> equipment;

    public ConferenceRoom(String roomName,int capacity){
        super(capacity);
        this.roomName=roomName;
        this.equipment = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public ArrayList<Equipment> getEquipment() {
        return equipment;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void addEquipment(Equipment item){
        this.equipment.add(item);
    }

    public void removeEquipment(Equipment item){
        this.equipment.remove(item);
    }
}
