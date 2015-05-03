import static org.junit.Assert.*;

/**
 * Created by Raul on 03/05/2015.
 * Testing UtilityMatrix recorded values
 */
public class UtilityMatrixTest {

    @org.junit.Test
    public void testGetResult() throws Exception {
        System.out.print("Testing utilityMatrix...");
        UtilityMatrix uM = new UtilityMatrix();
        Result r1 = uM.getResult(0,0);
        Result r2 = new Result(-2,-2);

        //System.out.println("r1.a: " +r1.getAyears() +" r1.b: " +r1.getByears() +" r2.a:" +r2.getAyears() +" r2.b:" +r2.getByears());
        //assertEquals(r1.getAyears(), r2.getAyears());
        //assertEquals(r1.getByears(), r2.getByears());
        assertTrue(r1.equals(r2));
        System.out.println("done!");
    }
}