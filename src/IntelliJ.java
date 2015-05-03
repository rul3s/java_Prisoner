import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 * IntelliJ strategy behaviour
 */
public class IntelliJ implements PlayerStrategy {
    private ArrayList<Boolean> results;

    public IntelliJ(){
        results = new ArrayList<>();
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean getAction(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
