public class DiningRoom extends Room {
    private String roomName;

    public DiningRoom(String roomName,int capacity){
        super(capacity);
        this.roomName=roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
