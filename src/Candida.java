import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 */
public class Candida implements PlayerStrategy {
    private static Candida instance;
    ArrayList<Boolean> results = new ArrayList<Boolean>();

    public static Candida getInstance(){
        if (instance == null) instance = new Candida();
        return instance;
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public boolean getAction(){return true;}
}
