import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Raul on 02/05/2015.
 * Interface for all strategies aplied by players
 */
public interface PlayerStrategy {
    /*
    Deep copy of the Strategy
     */
    PlayerStrategy deepCopy();
    /*
    Action to be performed
     */
    boolean getAction(ArrayList<Boolean> results);
    /*
    Get number of leafs in this tree
     */
    int getStrategiesCount();
    String getName();
    String name = null;
}
