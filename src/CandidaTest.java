import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Testing candida
 */
public class CandidaTest {

    @Test
    public void testDeepCopy() throws Exception {
        Candida c1 = new Candida();
        Candida c2 = (Candida) c1.deepCopy();
        assertEquals(c1.getName(),c2.getName());
    }

    @Test
    public void testGetAction() throws Exception {
        Candida c1 = new Candida();
        assertTrue(c1.getAction(new ArrayList<>()));
    }

    @Test
    public void testGetStrategiesCount() throws Exception {
        Candida c1 = new Candida();
        assertEquals(c1.getStrategiesCount(),1);
    }

    @Test
    public void testGetName() throws Exception {
        Candida c1 = new Candida();
        assertEquals(c1.getName(),"Candida");
    }
}