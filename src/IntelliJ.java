import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 */
public class IntelliJ implements PlayerStrategy {
    ArrayList<Boolean> results;

    public IntelliJ(){
        results = new ArrayList<Boolean>();
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public IntelliJ clone(){
        return this.clone();
    }

    public boolean getAction(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
