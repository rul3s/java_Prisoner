import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Raul on 02/05/2015.
 * Interface for all strategies aplied by players
 */
public interface PlayerStrategy {
    ArrayList<Boolean> results = null;
    ListIterator<Boolean> resIt = null;
    boolean getAction();
    void addResult(boolean lastResult);
    Object clone() throws CloneNotSupportedException;
}
