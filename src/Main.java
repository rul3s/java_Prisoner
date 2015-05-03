/**
 * Created by Raul on 02/05/2015.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Prisoner 0.1 started");
        String stratA, stratB;

        stratA = "random";
        stratB = "intellij";

        Play play = new Play(stratA,stratB);
        play.startGame();
    }
}
