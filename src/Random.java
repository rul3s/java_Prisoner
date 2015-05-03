import java.util.ArrayList;

/**
 * Created by Raul on 03/05/2015.
 * Random strategy behaviour
 */
public class Random implements PlayerStrategy {
    private String name = "Random";

    public Random(){}

    public PlayerStrategy deepCopy(){
        return new Random();
    }

    public boolean getAction(ArrayList<Boolean> results){
        java.util.Random random = new java.util.Random();
        return random.nextBoolean();
    }

    public int getStrategiesCount(){
        return 1;
    }

    public String getName(){
        return name;
    }
}
