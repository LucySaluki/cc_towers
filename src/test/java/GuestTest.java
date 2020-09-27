import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    private Guest guest;

    @Before
    public void before(){
        guest=new Guest("Joe");
    }
    @Test
    public void guestHasName(){
        assertEquals("Joe",guest.getName());
    }
    @Test
    public void canChangeGuestName(){
        guest.setName("Lucy");
        assertEquals("Lucy",guest.getName());
    }
}
