import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        guest1 = new Guest("Steph");
        guest2 = new Guest("Falk");
        guest3= new Guest("Lewis");
        bedroom = new Bedroom(1,RoomType.DOUBLE);
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
    }

    @Test
    public void hasNumber(){
        assertEquals(1,bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals("DOUBLE",bedroom.getRoomType().toString());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2,bedroom.getRoomCapacityFromEnum());

    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(2,bedroom.guestCount());
    }

    @Test
    public void canRemoveAllGuest(){
        bedroom.removeGuests();
        assertEquals(0,bedroom.guestCount());
    }

    @Test
    public void canRemoveSpecificGuest(){
        bedroom.removeSpecificGuest(guest1);
        assertEquals("Falk",bedroom.getGuests().get(0).getName());
    }

    @Test
    public void cannotExceedRoomCapacity(){
        bedroom.addGuest(guest3);
        assertEquals(2,bedroom.guestCount());
    }
}
