import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 */
public class Random implements PlayerStrategy {
    private static Random instance;
    ArrayList<Boolean> results = new ArrayList<Boolean>();
    
    private Random(){}

    public static Random getInstance(){
        if (instance == null) instance = new Random();
        return instance;
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public boolean getAction(){
        java.util.Random random = new java.util.Random();
        return random.nextBoolean();
    }


}
