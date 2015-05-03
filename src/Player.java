/**
 * Created by Raul on 02/05/2015.
 */
public class Player {
    private String name;
    private PlayerStrategy pStrategy;

    public Player(String name, String strategy){
        System.out.print("Creating player " +name +" with strategy " +strategy +"...");
        this.name = name;
        this.pStrategy = Register.getInstance().getStrategyCopy(strategy);
        System.out.println("done!");
    }

    private void notifyResult(boolean rivalAction){
        pStrategy.addResult(rivalAction);
    }

    /*
    action true = cooperate
    action false = shut up
     */
    private boolean action(){
        boolean action = pStrategy.getAction();
        return true;
    }

    public String getName(){
        return name;
    }

    public PlayerStrategy getStrategy(){
        return pStrategy;
    }
}
