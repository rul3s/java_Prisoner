import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 */
public class Candida implements PlayerStrategy {
    ArrayList<Boolean> results;

    public Candida(){
        results = new ArrayList<Boolean>();
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public Candida clone(){
        return this.clone();
    }

    public boolean getAction(){return true;}
}
