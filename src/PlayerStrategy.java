import java.util.ArrayList;

/**
 * Created by Raul on 02/05/2015.
 * Interface for all strategies aplied by players
 */
public interface PlayerStrategy {
    ArrayList<Boolean> results = new ArrayList<>();
    boolean getAction();
    void addResult(boolean lastResult);
    Object clone() throws CloneNotSupportedException;
}
