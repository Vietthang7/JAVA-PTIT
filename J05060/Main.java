package J05060;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<thiSinh> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            arr.add(new thiSinh("PH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for (thiSinh x : arr) {
            System.out.println(x);
        }
    }
}