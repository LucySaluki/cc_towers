import java.util.ArrayList;

public class Hotel {
    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String hotelName){
        this.hotelName=hotelName;
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
}
