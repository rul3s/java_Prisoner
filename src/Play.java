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
        System.out.println("Game initialized, player " +playerA.getName())
        ;
    }
}
