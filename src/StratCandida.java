/**
 * Created by Raul on 03/05/2015.
 */
public class StratCandida extends Stratergy{
    private static StratCandida instance;

    public static StratCandida getInstance(){
        if (instance == null) instance = new StratCandida();
        return instance;
    }

    public boolean getAction(){return true;}
}
