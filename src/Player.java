import java.util.ArrayList;

/**
 * Created by Raul on 02/05/2015.
 * Represents a player and its strategy
 */
public class Player {
    private ArrayList<Boolean> results = null;
    private String name;
    private PlayerStrategy pStrategy;

    public Player(String name, String strategy){
        //System.out.print("Creating player " +name +" with strategy " +strategy +"...");
        this.name = name;
        this.pStrategy = Register.getInstance().getStrategyCopy(strategy);
        results = new ArrayList<>();
        //System.out.println("done!");
    }

    /*
    action true = cooperate
    action false = shut up
     */
    public boolean action(){
        //System.out.println("Strategy = " +pStrategy.getName());
        return pStrategy.getAction(results);
    }

    public void saveResult(boolean rivalAction){
        results.add(rivalAction);
    }

    public boolean getLastResult(){
        return results.get(results.size()-1);
    }

    public String getName(){
        return name;
    }

    public PlayerStrategy getStrategy(){
        return pStrategy;
    }
}
