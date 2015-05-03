import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Raul on 02/05/2015.
 * Singleton Class, just one instance of register.
 * This class knows all strategies and return copies of them to players
 */
public class Register {
    private static Register instance;
    private Xula xula;
    private Candida candida;
    private Random random;
    private IntelliJ intelliJ;
    private BestOf bestOf;

    public static Register getInstance(){
        if(instance==null) instance = new Register();
        return instance;
    }

    /*
    By default bestOf will be created whith candida, xula and random
     */
    private Register(){
        xula = new Xula();
        candida = new Candida();
        random = new Random();
        intelliJ = new IntelliJ();
        bestOf = new BestOf();
        bestOf.addSimpleStrategy(candida);
        bestOf.addSimpleStrategy(xula);
        bestOf.addSimpleStrategy(random);
    }

    public PlayerStrategy getStrategyCopy(String strat){
        try{
            switch (strat){
                case "xula":
                    return xula.deepCopy();
                case "candida":
                    return candida.deepCopy();
                case "random":
                    return random.deepCopy();
                case "bestof":
                    return bestOf;
                default:
                    return intelliJ.deepCopy();
            }
        }catch (Exception e){
            return new Random();
        }
    }
}
