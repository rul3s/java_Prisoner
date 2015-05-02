/**
 * Created by Raul on 02/05/2015.
 */
public class Player {
    private String name;
    private PlayerStrategy playerStrategy;

    public Player(String name, String strategy){
        System.out.print("Creating player " +name +"...");
        this.name = name;
        this.playerStrategy = new PlayerStrategy(strategy);
        System.out.println("done!");
    }

    private void notifyStrategy(boolean rivalAction){

    }

    /*
    action true = cooperate
    action false = shut up
     */
    private boolean action(){
        boolean action = playerStrategy.getAction();
        return true;
    }

    public String getName(){return name;}
    public PlayerStrategy getPlayerStrategy(){return playerStrategy;}
}
