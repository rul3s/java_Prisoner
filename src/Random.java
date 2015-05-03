import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 * Random strategy behaviour
 */
public class Random implements PlayerStrategy {
    private ArrayList<Boolean> results;
    
    public Random(){
        results = new ArrayList<>();
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean getAction(){
        java.util.Random random = new java.util.Random();
        return random.nextBoolean();
    }
}
