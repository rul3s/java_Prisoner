import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Testing Xula Strategy
 */
public class XulaTest {
    @Test
    public void testDeepCopy() throws Exception {
        Xula c1 = new Xula();
        Xula c2 = (Xula) c1.deepCopy();
        assertEquals(c1.getName(),c2.getName());
    }

    @Test
    public void testGetAction() throws Exception {
        Xula c1 = new Xula();
        assertFalse(c1.getAction(new ArrayList<>()));
    }

    @Test
    public void testGetStrategiesCount() throws Exception {
        Xula c1 = new Xula();
        assertEquals(c1.getStrategiesCount(),1);
    }

    @Test
    public void testGetName() throws Exception {
        Xula c1 = new Xula();
        assertEquals(c1.getName(),"Xula");
    }
}