import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquipmentTest {
    private Equipment equipment;

    @Before
    public void before() {
        equipment = new Equipment(5, EquipmentType.CHAIRS);
    }

    @Test
    public void hasNumberOfItems(){
        assertEquals(5, equipment.getNumberOfItems());
    }

    @Test
    public void hasEquipmentType(){
        assertEquals("CHAIRS",equipment.getEquipmentType().toString());
    }
}
