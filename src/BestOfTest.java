import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Testing BestOf Strategy
 */
public class BestOfTest {

    /**
     * We know it works perfect if numer of strategies, name, and ArrayList are the same
     * @throws Exception
     */
    @Test
    public void testDeepCopy() throws Exception {
        BestOf b1 = new BestOf();
        BestOf b2 = (BestOf) b1.deepCopy();

        assertEquals(b1.getStrategiesCount(),b2.getStrategiesCount());
        assertEquals(b1.getName(),b2.getName());
        assertEquals(b1.getStrategies(),b2.getStrategies());
    }

    /**
     * First we add 3 strategies, compare, and then two more, and compare again.
     * @throws Exception
     */
    @Test
    public void testGetAction() throws Exception {
        BestOf b1 = new BestOf();
        b1.addSimpleStrategy(new Candida());
        b1.addSimpleStrategy(new Xula());
        b1.addSimpleStrategy(new Candida());

        assertTrue(b1.getAction(new ArrayList<>()));

        b1.addSimpleStrategy(new Xula());
        b1.addSimpleStrategy(new Xula());

        assertFalse(b1.getAction(new ArrayList<>()));
    }

    @Test
    public void testGetStrategiesCount() throws Exception {
        BestOf b1 = new BestOf();
        b1.addSimpleStrategy(new Candida());
        b1.addSimpleStrategy(new Xula());
        b1.addSimpleStrategy(new Candida());

        assertEquals(b1.getStrategiesCount(), 3);

        b1.addSimpleStrategy(new IntelliJ());
        b1.addSimpleStrategy(new Random());

        assertEquals(b1.getStrategiesCount(), 5);
    }
}