/**
 * Created by Raul on 02/05/2015.
 */
public class Result {
    /*
    T = Recompensa per desertar quan l'altre cooperi
     */
    private int T;

    /*
    R = La recompensa per la col·laboració mútua.
     */
    private int R;

    /*
    La recompensa per la deserció mútua
     */
    private int P;

    /*
    La recompensa per fer el primo i cooperar quan l'altre deserta.
     */
    private int S;

    public Result(int T, int R, int P, int S){
        this.T = T;
        this.R = R;
        this.P = P;
        this.S = S;
    }
}
