import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

class Pair implements Serializable, Comparable<Pair>{
    private int first, second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
    
    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }

    public int compareTo(Pair other){
        if(this.first != other.first) return this.first - other.first;
        return this.first - other.first;
    }
    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}

public class J07041 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) ios.readObject();
        TreeSet<Pair> set = new TreeSet<>();
        for(Pair x : a)
            if(x.getFirst() < x.getSecond()) set.add(x);
        for(Pair x : set) System.out.println(x);
    }
}