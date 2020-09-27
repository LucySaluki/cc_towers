import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(String hotelName){
        this.hotelName=hotelName;
        this.bedrooms=new ArrayList<>();
        this.conferenceRooms= new ArrayList<>();
        this.bookings= new ArrayList<>();
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
}
