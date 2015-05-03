import java.util.ArrayList;

/**
 * Created by Raul on 02/05/2015.
 * Starting point of execution
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Prisoner started\n");
        int numRounds;
        String stratA, stratB;


        if(args.length<3){
            System.out.println("Incorrect Execution, please do it like this:\nMain.java (numrounds) (strategyForPlayerA) (strategyForPlayerB)");
            System.exit(-1);
        }
        numRounds = Integer.parseInt(args[0]);
        stratA = args[1];
        stratB = args[2];

        System.out.println("*******************************************\nNumber of rounds: " +numRounds +"\nPlayerA Strategy: " +stratA +"\nPlayerB Strategy: " +stratB +"\n*******************************************\n");

        Play play = new Play(stratA,stratB,numRounds);
        play.startGame();
        System.exit(0);
    }
}
