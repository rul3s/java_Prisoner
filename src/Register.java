/**
 * Created by Raul on 02/05/2015.
 */
public class Register {
    private static Register instance;
    StratXula xula;
    StratCandida candida;
    StratRandom random;
    StratIntelligent intellJ;

    public static Register getInstance(){
        if(instance==null) instance = new Register();
        return instance;
    }

    private Register(){
        xula = StratXula.getInstance();
        candida = StratCandida.getInstance();
        random = StratRandom.getInstance();
        intellJ = StratIntelligent.getInstance();
    }

    public Strategy getStratergy(String strat){
        switch (strat){
            case "xula":
                return xula;
            case "candida":
                return candida;
            case "random":
                return random;
            default:
                return intellJ;
        }
    }
}
