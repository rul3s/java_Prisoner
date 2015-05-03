import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 */
public class Xula implements PlayerStrategy {
    ArrayList<Boolean> results;

    public Xula(){
        results = new ArrayList<Boolean>();
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
