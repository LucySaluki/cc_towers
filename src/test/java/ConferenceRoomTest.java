import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        guest1 = new Guest("Freddie");
        guest2 = new Guest("Ian");
        conferenceRoom = new ConferenceRoom("The Winter Room",2);
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        guest3 = new Guest ("Annie");
    }
    @Test
    public void hasName(){
        assertEquals("The Winter Room", conferenceRoom.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
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
        assertEquals("Ian", conferenceRoom.getGuests().get(0).getName());
    }

    @Test
    public void cannotExceedCapacity(){
        conferenceRoom.addGuest(guest3);
        assertEquals(2, conferenceRoom.guestCount());
    }
}
