package J07040;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList<String>) in.readObject();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> se1 = new LinkedHashSet<>();
        LinkedHashSet<String> se2 = new LinkedHashSet<>();
        for (String x : arr) {
            String[] tmp = x.trim().toLowerCase().split("\\s+");
            for (String y : tmp) {
                se1.add(y);
            }
        }
        while (sc.hasNext()) {
            String x = sc.next().toLowerCase();
            se2.add(x);
        }
        for (String x : se2) {
            if (se1.contains(x)) {
                System.out.println(x);
            }
        }

    }
}
