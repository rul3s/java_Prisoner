import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Testing player behaviour
 */
public class PlayerTest {

    @Test
    public void testAction() throws Exception {
        assertTrue(new Player("A","candida").action());
        assertFalse(new Player("A", "xula").action());
    }

    @Test
    public void testSaveResult() throws Exception {
        Player a = new Player("a","candida");
        a.saveResult(true);
        assertTrue(a.getLastResult());
        a.saveResult(false);
        assertFalse(a.getLastResult());
    }

    @Test
    public void testGetName() throws Exception {
        Player a = new Player("potatoe","candida");
        assertEquals(a.getName(), "potatoe");
    }

    @Test
    public void testGetStrategy() throws Exception {
        Player a = new Player("potatoe","candida");
        assertEquals(a.getStrategy().getName(), new Candida().getName());
    }
}