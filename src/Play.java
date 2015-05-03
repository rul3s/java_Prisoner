import java.util.ArrayList;

/**
 * Created by Raul on 02/05/2015.
 * To init a game
 */
public class Play {
    private int aYears, bYears, rounds;
    private Player playerA;
    private Player playerB;
    private UtilityMatrix uMatrix;

    public Play(String stratA, String stratB, int numRounds){
        System.out.println("Initializing game...");
        aYears = 0;
        bYears = 0;
        rounds = numRounds;

        uMatrix = new UtilityMatrix();
        playerA = new Player("A", stratA);
        playerB = new Player("B", stratB);
    }

    public void startGame(){
        int actionA, actionB;
        boolean cooperateA, cooperateB;
        Result res;

        System.out.println("Game started");
        for(int i=0;i<rounds;i++){
            cooperateA = playerA.action();
            cooperateB = playerB.action();

            System.out.println("Round " +i +", playerA, cooperate? " +cooperateA +", playerB, cooperate?" +cooperateB);

            if(cooperateA)actionA = 1;
            else actionA = 0;
            if(cooperateB)actionB = 1;
            else actionB = 0;

            res = uMatrix.getResult(actionA,actionB);
            System.out.println("Result: PlayerA: " +res.getAyears() +", PlayerB: " +res.getByears());

            aYears += 3+res.getAyears();
            bYears += 3+res.getByears();

            playerA.saveResult(cooperateB);
            playerB.saveResult(cooperateA);
        }
        System.out.println("Game finished, results:");
        System.out.println("Player A, years = " +aYears);
        System.out.println("Player B, years = " +bYears);
    }
}
