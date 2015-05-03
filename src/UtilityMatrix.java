/**
 * Created by Raul on 02/05/2015.
 * Utility Matrix to calculate costs in years
 */
public class UtilityMatrix {
    /*
    0 = Decided not to cooperate with policemen
    1 = Decided to cooperate with policemen
     */
    private Result matrix[][] = new Result[2][2];

    /*
    Initialize matrix according to enunciate and with both rules
    1 = cooperate
    0 = no cooperate
     */
    public UtilityMatrix(){
        matrix[1][1] = new Result(-1,-1);
        matrix[1][0] = new Result(-3,0);
        matrix[0][1] = new Result(0,-3);
        matrix[0][0] = new Result(-2,-2);
    }

    public Result getResult(int a, int b){
        return matrix[a][b];
    }
}
