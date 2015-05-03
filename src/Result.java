/**
 * Created by Raul on 02/05/2015.
 * Needed to return the result of a certain combination
 */
public class Result {

    /*
    Discounted years to First Player
     */
    private int a;

    /*
    Discounted years to Second Player
     */
    private int b;

    public Result(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getAyears(){
        return a;
    }

    public int getByears(){
        return b;
    }

    public boolean equals(Result r){
        return (r.getAyears() == this.a && r.getByears() == this.b);
    }
}
