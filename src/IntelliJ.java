import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by Raul on 03/05/2015.
 * IntelliJ strategy behaviour
 */
public class IntelliJ implements PlayerStrategy {
    private ArrayList<Boolean> results;
    private ListIterator<Boolean> resIt;
    private float numCooperations;

    public IntelliJ(){
        results = new ArrayList<>();
    }

    public void addResult(boolean lastResult){
        results.add(lastResult);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean getAction(){
        Random random = new Random();
        if(calcCooperationPerc()>=0.10 && results.size()>10)return true;
        else return false;
    }

    private float calcCooperationPerc(){
        numCooperations = 0;
        resIt = results.listIterator();

        while(resIt.hasNext()){
            if(resIt.next())numCooperations++;
        }

        return (numCooperations/results.size());
    }
}
