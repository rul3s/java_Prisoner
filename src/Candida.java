import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 * Candida strategy behaviour
 */
public class Candida implements PlayerStrategy {
    private ArrayList<Boolean> results;

    public Candida(){
        results = new ArrayList<>();
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean getAction(){return true;}
}
