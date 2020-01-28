import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void getVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void empty() {
        assertEquals(0, waterBottle.empty());
    }
    @Test
    public void fill() {
        assertEquals(100, waterBottle.fill());
    }
}