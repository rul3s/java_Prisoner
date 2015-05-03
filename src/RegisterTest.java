import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Testing Register
 */
public class RegisterTest {

    @Test
    public void testGetInstance() throws Exception {
        assertTrue(Register.getInstance()!=null);
    }

    @Test
    public void testGetStrategyCopy() throws Exception {
        assertEquals(Register.getInstance().getStrategyCopy("candida").getName(),"Candida");
        assertEquals(Register.getInstance().getStrategyCopy("xula").getName(), "Xula");
        assertEquals(Register.getInstance().getStrategyCopy("random").getName(),"Random");
        assertEquals(Register.getInstance().getStrategyCopy("intellij").getName(),"IntelliJ");
        assertEquals(Register.getInstance().getStrategyCopy("bestof").getName(),"BestOf");
    }
}