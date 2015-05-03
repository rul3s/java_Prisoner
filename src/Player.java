/**
 * Created by Raul on 02/05/2015.
 */
public class Player {
    private String name;
    private PlayerStrategy pStrategy;

    public Player(String name, String strategy){
        System.out.print("Creating player " +name +" with strategy " +strategy +"...");
        this.name = name;

        switch (strategy){
            case "xula":
                System.out.print(",Strategy xula assigned...");
                pStrategy = new Xula();
                break;
            case "candida":
                System.out.print(",Strategy candida assigned...");
                pStrategy = new Candida();
                break;
            case "random":
                System.out.print(",Strategy random assigned...");
                pStrategy = new Random();
                break;
            default:
                System.out.print(",Strategy intellij assigned...");
                pStrategy = new IntelliJ();
                break;
        }

        //this.pStrategy = new Candida();
        //this.pStrategy = Register.getInstance().getStrategyCopy(strategy);
        System.out.println("done!");
    }

    /*
    action true = cooperate
    action false = shut up
     */
    private boolean action(){
        boolean action = pStrategy.getAction();
        return true;
    }

    public void notifyResult(boolean rivalAction){
        pStrategy.addResult(rivalAction);
    }

    public String getName(){
        return name;
    }

    public PlayerStrategy getStrategy(){
        return pStrategy;
    }
}
