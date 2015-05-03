import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 */
public class IntelliJ implements PlayerStrategy {
    private static IntelliJ instance;
    ArrayList<Boolean> results = new ArrayList<Boolean>();

    private IntelliJ(){}

    public static IntelliJ getInstance(){
        if (instance == null) instance = new IntelliJ();
        return instance;
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
