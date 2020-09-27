import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    @Before
    public void before(){
        hotel=new Hotel("Fawlty Towers");
        bedroom1= new Bedroom(1,RoomType.DOUBLE);
        bedroom2= new Bedroom(2, RoomType.SINGLE);
        conferenceRoom=new ConferenceRoom("The Winter Room",12);
        guest1=new Guest("Steph");
        guest2 = new Guest("Falk");
        guest3 = new Guest("Lewis");
        guest4= new Guest("Ian");
        guest5 = new Guest("Freddie");
    }
    @Test
    public void hasName(){
        assertEquals("Fawlty Towers",hotel.getHotelName());
    }

   @Test
   public void canAddBedrooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        assertEquals(2,hotel.bedroomCount());
   }

    @Test
    public void canAddConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1,hotel.conferenceRoomCount());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroom(bedroom1);
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(2,bedroom1.guestCount());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        conferenceRoom.addGuest(guest4);
        conferenceRoom.addGuest(guest5);
        assertEquals(2,conferenceRoom.guestCount());
    }

    @Test
    public void canGetTotalGuestsInHotel(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom);
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        bedroom2.addGuest(guest3);
        conferenceRoom.addGuest(guest4);
        conferenceRoom.addGuest(guest5);
        assertEquals(5,hotel.totalGuests());
    }
}
