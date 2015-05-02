/**
 * Created by Raul on 03/05/2015.
 */
public class StratXula extends Stratergy{
    private static StratXula instance;

    public static StratXula getInstance(){
        if (instance == null) instance = new StratXula();
        return instance;
    }

    private StratXula(){};

    public boolean getAction(){return false;}
}
