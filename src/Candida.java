import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 * Candida strategy behaviour
 */
public class Candida implements PlayerStrategy {
    private String name = "Candida";

    public Candida(){}

    public PlayerStrategy deepCopy(){
        return new Candida();
    }

    public boolean getAction(ArrayList<Boolean> results){
        return true;
    }

    public int getStrategiesCount(){
        return 1;
    }

    public String getName(){
        return name;
    }
}
