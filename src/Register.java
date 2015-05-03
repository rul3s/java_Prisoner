/**
 * Created by Raul on 02/05/2015.
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
        xula = Xula.getInstance();
        candida = Candida.getInstance();
        random = Random.getInstance();
        intellJ = IntelliJ.getInstance();
    }

    public PlayerStrategy getStrategyCopy(String strat){
        switch (strat){
            case "xula":
                return xula.clone();
            case "candida":
                return candida.clone();
            case "random":
                return random.clone();
            default:
                return intellJ.clone();
        }
    }
}
