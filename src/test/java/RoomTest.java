import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {
        Room room;

        //BELOW: Inheritance related tests:

    @Test
    public void bedroomAsRoom() {
        room = new Bedroom(1, RoomType.SINGLE);
        assertEquals(1, room.getCapacity());
    }

    @Test
    public void conferenceRoomAsRoom() {
        room = new ConferenceRoom("The Summer Room", 25);
        assertEquals(25, room.getCapacity());
    }

    @Test
    public void changeTypeOfRoom() {
        room = new Bedroom(1, RoomType.SINGLE);
        room = new Bedroom(1, RoomType.DOUBLE);
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void collectionOfParentClassObjects() {
        ArrayList<Room> hotel = new ArrayList<Room>();
        hotel.add( new Bedroom(1, RoomType.DOUBLE));
        hotel.add( new ConferenceRoom("The Autumn Room", 100));
        hotel.add( new DiningRoom("The Main Dining Room", 100));
        assertEquals(3, hotel.size());
    }

    @Test
    public void objectRemembersItsType() {
        room = new Bedroom(1, RoomType.DOUBLE);
        Bedroom bedroom  = (Bedroom) room;
        assertEquals("DOUBLE", bedroom.getRoomType().toString());
    }
}
