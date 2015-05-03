import java.util.ArrayList;

/**
 * Created by Raul on 02/05/2015.
 */
public interface PlayerStrategy {
    ArrayList<Boolean> results = new ArrayList<Boolean>();
    public boolean getAction();
    public void addResult(boolean lastResult);
}
