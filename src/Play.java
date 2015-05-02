/**
 * Created by Raul on 02/05/2015.
 */
public class Play {
    private int aYears, bYears, rounds;
    private Player playerA;
    private Player playerB;
    private UtilityMatrix uMatrix;

    public Play(String stratA, String stratB){
        System.out.println("Initializing game...");
        aYears = 0;
        bYears = 0;
        rounds = 50;

        playerA = new Player("A", stratA);
        System.out.println("Created player " +playerA.getName());
        playerB = new Player("B", stratB);
        System.out.println("Created player " +playerB.getName());
        uMatrix = new UtilityMatrix();
        System.out.println("Created matrix");
    }

    public void startGame(){
        int actionA;
        int actionB;
        Result res;

        System.out.println("Game started");
        for(int i=0;i<rounds;i++){
            if(playerA.getPlayerStrategy().getAction())actionA = 1;
            else actionA = 0;
            if(playerB.getPlayerStrategy().getAction())actionB = 1;
            else actionB = 0;

            System.out.print(actionA +" " +actionB +" // ");
            res = uMatrix.getResult(actionA,actionB);
            System.out.println(res.getAyears() +" " +res.getByears());

            aYears += 3-res.getAyears();
            bYears += 3-res.getByears();
        }
        System.out.println("Game finished, results:");
        System.out.println("Player A, years = " +aYears);
        System.out.println("Player B, years = " +bYears);
    }
}
