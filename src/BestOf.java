import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Raul on 03/05/2015.
 * Decides for an action asking to other Strategies and getting the most common decision
 */
public class BestOf implements PlayerStrategy, Serializable{
    private String name = "BestOf";
    protected ArrayList<PlayerStrategy> strategies = new ArrayList<>();
    private ArrayList<Boolean> results;

    public BestOf(){
        results = new ArrayList<>();
    }

    public PlayerStrategy deepCopy() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (PlayerStrategy) ois.readObject();
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public boolean getAction(ArrayList<Boolean> results){
        int coop=0, noCoop=0;
        ArrayList<Boolean> indResults = new ArrayList<>();
        Iterator<Boolean> itIndRes = indResults.iterator();

        for(PlayerStrategy ps : strategies){
            indResults.add(ps.getAction(results));
        }

        for(boolean bol : indResults){
            if (bol) coop++;
            else noCoop++;
        }

        return coop>noCoop;
    }

    public int getStrategiesCount(){
        int count = 0;

        for(PlayerStrategy ps : strategies){
            count += ps.getStrategiesCount();
        }
        return count;
    }

    /*
    Add a simple strategy to the composite
     */
    public void addSimpleStrategy(PlayerStrategy strat){
        strategies.add(strat);
    }

    public String getName(){
        return name;
    }
}