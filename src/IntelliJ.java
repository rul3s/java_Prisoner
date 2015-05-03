import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 * IntelliJ strategy behaviour
 */
public class IntelliJ implements PlayerStrategy {
    private String name = "IntelliJ";
    private ListIterator<Boolean> resIt;
    private float numCooperations;

    public IntelliJ(){}

    public PlayerStrategy deepCopy(){
        return new IntelliJ();
    }

    public boolean getAction(ArrayList<Boolean> results) {
        Random random = new Random();
        return (calcCooperationPerc(results)>=0.10 && results.size()>5);
    }

    /*
    Calculates the percentage of cooperations with policemen by the other player
     */
    private float calcCooperationPerc(ArrayList<Boolean> results){
        numCooperations = 0;
        resIt = results.listIterator();

        while(resIt.hasNext()){
            if(resIt.next())numCooperations++;
        }

        return (numCooperations/results.size());
    }

    public int getStrategiesCount(){
        return 1;
    }

    public String getName(){
        return name;
    }
}