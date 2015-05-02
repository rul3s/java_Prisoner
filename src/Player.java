/**
 * Created by Raul on 02/05/2015.
 */
public class Player {
    private String name;
    private PlayerStrategy strategy;

    public Player(String name, String strategy){
        this.name = name;
        this.strategy = new PlayerStrategy(strategy);
    }
}
