
import java.io.*;
import java.util.*;

public class J07007 {

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }

    public static class WordSet {

        private Set<String> mySet = new TreeSet<>();

        public WordSet(String s) throws IOException {
            Scanner sc = new Scanner(new File(s));
            while (sc.hasNext()) {
                mySet.add(sc.next().toLowerCase());
            }
            sc.close();
        }

        @Override
        public String toString() {
            String res = "";
            for (String i : mySet) {
                res += i + "\n";
            }
            return res;
        }
    }
}
