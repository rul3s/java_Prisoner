import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 */
public class StratRandom extends Stratergy{
    private static StratRandom instance;

    public static StratRandom getInstance(){
        if (instance == null) instance = new StratRandom();
        return instance;
    }

    public boolean getAction(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
