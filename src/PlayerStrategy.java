/**
 * Created by Raul on 02/05/2015.
 */
public class PlayerStrategy {
    private Strategy strategy;

    public PlayerStrategy(String strategy){
        this.strategy = Register.getInstance().getStratergy(strategy);
    }

    public boolean getAction(){
        return strategy.getAction();
    }
}
