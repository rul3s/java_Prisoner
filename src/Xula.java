import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 */
public class Xula implements PlayerStrategy {
    private static Xula instance;
    ArrayList<Boolean> results = new ArrayList<Boolean>();

    private Xula(){};

    public static Xula getInstance(){
        if (instance == null) instance = new Xula();
        return instance;
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public Xula clone(){
        return this.clone();
    }

    public boolean getAction(){
        return false;
    }
}
