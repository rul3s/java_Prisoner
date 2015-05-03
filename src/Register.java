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
    It not specified which strategies will implement the BestOf will take "xula" and "intelliJ" by default, else will
    use second constructor and read them
     */
    private Register(){
        xula = new Xula();
        candida = new Candida();
        random = new Random();
        intelliJ = new IntelliJ();
        bestOf = new BestOf();
        bestOf.addSimpleStrategy(xula);
        bestOf.addSimpleStrategy(intelliJ);
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
                case "bestOf":
                    return bestOf.deepCopy();
                default:
                    return intelliJ.deepCopy();
            }
        }catch (Exception e){
            return new Random();
        }
    }
}
