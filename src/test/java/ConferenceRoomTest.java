import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {
        guest1 = new Guest("Sonny");
        guest2 = new Guest("Lucy");
        conferenceRoom = new ConferenceRoom("The Winter Room",12);
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
    }
    @Test
    public void hasName(){
        assertEquals("The Winter Room", conferenceRoom.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(12, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        assertEquals(2, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuestsFromConferenceRoom(){
        conferenceRoom.removeGuests();
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveSpecificGuestFromConferenceRoom(){
        conferenceRoom.removeSpecificGuest(guest1);
        assertEquals("Lucy", conferenceRoom.guests.get(0).getName());
    }
}
