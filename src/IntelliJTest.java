import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Testing IntelliJ Strategy
 */
public class IntelliJTest {

    @Test
    public void testDeepCopy() throws Exception {
        IntelliJ c1 = new IntelliJ();
        IntelliJ c2 = (IntelliJ) c1.deepCopy();
        assertEquals(c1.getName(),c2.getName());
    }

    @Test
    public void testGetAction() throws Exception {
        ArrayList<Boolean> res1 = new ArrayList<>();
        ArrayList<Boolean> res2 = new ArrayList<>();

        for(int i=0;i<10;i++)res1.add(true);
        for(int i=0;i<10;i++)res2.add(false);

        IntelliJ c1 = new IntelliJ();
        assertTrue(c1.getAction(res1));
        assertFalse(c1.getAction(res2));
    }

    @Test
    public void testGetStrategiesCount() throws Exception {
        IntelliJ c1 = new IntelliJ();
        assertEquals(c1.getStrategiesCount(),1);
    }

    @Test
    public void testGetName() throws Exception {
        IntelliJ c1 = new IntelliJ();
        assertEquals(c1.getName(),"IntelliJ");
    }
}