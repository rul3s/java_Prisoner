/**
 * Created by Raul on 02/05/2015.
 * Singleton Class, just one instance of register.
 * This class knows all strategies and return copies of them to players
 */
public class Register {
    private static Register instance;
    Xula xula;
    Candida candida;
    Random random;
    IntelliJ intellJ;

    public static Register getInstance(){
        if(instance==null) instance = new Register();
        return instance;
    }

    private Register(){
        xula = new Xula();
        candida = new Candida();
        random = new Random();
        intellJ = new IntelliJ();
    }

    public PlayerStrategy getStrategyCopy(String strat){
        try{
            switch (strat){
                case "xula":
                    return (Xula) xula.clone();
                case "candida":
                    return (Candida) candida.clone();
                case "random":
                    return (Random) random.clone();
                default:
                    return (IntelliJ) intellJ.clone();
            }
        }catch (Exception e){
            return new Random();
        }
    }
}
