import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 * Xula strategy behaviour
 */
public class Xula implements PlayerStrategy {
    private ArrayList<Boolean> results;

    public Xula(){
        results = new ArrayList<>();
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean getAction(){
        return false;
    }
}
