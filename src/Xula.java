import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 * Xula strategy behaviour
 */
public class Xula implements PlayerStrategy {
    private String name = "Xula";
    public Xula(){}

    public PlayerStrategy deepCopy(){
        return new Xula();
    }

    public boolean getAction(ArrayList<Boolean> results){
        return false;
    }

    public int getStrategiesCount(){
        return 1;
    }

    public String getName(){
        return name;
    }
}
