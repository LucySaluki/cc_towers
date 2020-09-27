import org.junit.Before;

import java.util.ArrayList;

public class RoomTest {

    private Room room;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {
        guest1 = new Guest("Sonny");
        guest2 = new Guest("Lucy");
    }
}
