import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    HashMap<String, DiningRoom> diningRooms;

    public Hotel(String hotelName){
        this.hotelName=hotelName;
        this.bedrooms=new ArrayList<>();
        this.conferenceRooms= new ArrayList<>();
        this.bookings= new ArrayList<>();
        this.diningRooms= new HashMap<>();
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

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    private Booking bookRoom(Bedroom bedroom, int nights){
         Booking booking= new Booking(nights,bedroom);
         this.bookings.add(booking);
         return booking;
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void setDiningRooms(HashMap<String, DiningRoom> diningRoomHashMap) {
        this.diningRooms = diningRoomHashMap;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addDiningRoom(String roomName, DiningRoom diningRoom){
        this.diningRooms.put(roomName,diningRoom);
    }

    public int diningRoomCount(){
        return this.diningRooms.size();
    }
}
