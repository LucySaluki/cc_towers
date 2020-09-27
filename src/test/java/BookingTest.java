import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

   private Booking booking;
   private Bedroom bedroom;

    @Before
    public void before(){
        bedroom= new Bedroom(1,RoomType.SINGLE);
        booking = new Booking(3, bedroom);
    }

    @Test
    public void hasBedroom(){
        assertEquals(1,booking.getBedroom().getRoomNumber());
    }

    @Test
    public void hasNights(){
        assertEquals(3, booking.getNights());
    }

    @Test
    public void getBill(){
        assertEquals(150.00,booking.calculateBill(),0.01);
    }
}
