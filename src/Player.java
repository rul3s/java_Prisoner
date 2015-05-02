/**
 * Created by Raul on 02/05/2015.
 */
public class Player {
    private String name;
    private PlayerStrategy playerStrategy;

    public Player(String name, String strategy){
        this.name = name;
        this.playerStrategy = new PlayerStrategy(strategy);
    }

    public String getName(){return name;}
    public PlayerStrategy getPlayerStrategy(){return playerStrategy;}
}
