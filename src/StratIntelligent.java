import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 */
public class StratIntelligent implements Strategy {
    private static StratIntelligent instance;

    public static StratIntelligent getInstance(){
        if (instance == null) instance = new StratIntelligent();
        return instance;
    }

    public boolean getAction(PlayerStrategy pStrat){
        Random random = new Random();
        return random.nextBoolean();
    }
}
