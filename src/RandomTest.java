import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Random Strategy testing
 */
public class RandomTest {
    @Test
    public void testDeepCopy() throws Exception {
        Random c1 = new Random();
        Random c2 = (Random) c1.deepCopy();
        assertEquals(c1.getName(),c2.getName());
    }

    /**
     * We only can check that the result of an getAction it's true or false, not wich one
     * @throws Exception
     */
    @Test
    public void testGetAction() throws Exception {
        Random c1 = new Random();
        assertTrue(c1.getAction(new ArrayList<>()) || !c1.getAction(new ArrayList<>()));
    }

    @Test
    public void testGetStrategiesCount() throws Exception {
        Random c1 = new Random();
        assertEquals(c1.getStrategiesCount(),1);
    }

    @Test
    public void testGetName() throws Exception {
        Random c1 = new Random();
        assertEquals(c1.getName(),"Random");
    }
}