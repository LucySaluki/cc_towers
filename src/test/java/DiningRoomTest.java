import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
        private DiningRoom diningRoom;
        private Guest guest1;
        private Guest guest2;
        private Guest guest3;
        private Equipment equipment;

        @Before
        public void before() {
            guest1 = new Guest("Katie");
            guest2 = new Guest("Paul");
            diningRoom = new DiningRoom("The Breakfast Room",2);
            diningRoom.addGuest(guest1);
            diningRoom.addGuest(guest2);
            guest3 = new Guest ("Molly");

        }
        @Test
        public void hasName(){
            assertEquals("The Breakfast Room", diningRoom.getRoomName());
        }

        @Test
        public void hasCapacity(){
            assertEquals(2, diningRoom.getCapacity());
        }

        @Test
        public void canAddGuestToConferenceRoom(){
            assertEquals(2, diningRoom.guestCount());
        }

        @Test
        public void canRemoveGuestsFromConferenceRoom(){
            diningRoom.removeGuests();
            assertEquals(0, diningRoom.guestCount());
        }

        @Test
        public void canRemoveSpecificGuestFromConferenceRoom(){
            diningRoom.removeSpecificGuest(guest1);
            assertEquals("Paul", diningRoom.getGuests().get(0).getName());
        }

        @Test
        public void cannotExceedCapacity(){
            diningRoom.addGuest(guest3);
            assertEquals(2, diningRoom.guestCount());
        }
}
