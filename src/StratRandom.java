import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 */
public class StratRandom implements Strategy {
    private static StratRandom instance;

    public static StratRandom getInstance(){
        if (instance == null) instance = new StratRandom();
        return instance;
    }

    public boolean getAction(PlayerStrategy pStrat){
        Random random = new Random();
        return random.nextBoolean();
    }
}
