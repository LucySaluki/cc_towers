public class ConferenceRoom extends Room {
    private String roomName;

    public ConferenceRoom(String roomName,int capacity){
        super(capacity);
        this.roomName=roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
