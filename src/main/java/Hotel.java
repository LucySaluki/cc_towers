import java.util.ArrayList;

public class Hotel {
    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String hotelName){
        this.hotelName=hotelName;
        this.bedrooms=new ArrayList<>();
        this.conferenceRooms= new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public int bedroomCount(){
        return this.bedrooms.size();
    }

    public int conferenceRoomCount(){
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int totalGuests(){
        int total=0;
        for (Bedroom bedroom: this.bedrooms){
            total += bedroom.guests.size();
            }
        for (ConferenceRoom conferenceRoom: this.conferenceRooms){
            total += conferenceRoom.guests.size();
        }
        return total;
    }
}
