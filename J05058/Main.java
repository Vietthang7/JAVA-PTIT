package J05058;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<thiSinh> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            arr.add(new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(arr, new Comparator<thiSinh>() {
            public int compare(thiSinh t, thiSinh t1) {
                if (t.tongDiem() != t1.tongDiem()) {
                    if (t.tongDiem() <= t1.tongDiem()) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return t.getMa().compareTo(t1.getMa());
                }
            }
        });
        for (thiSinh x : arr) {
            System.out.println(x);
        }

    }
}
