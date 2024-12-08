package J05061;

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
        Collections.sort(arr, new Comparator<thiSinh>() {
            public int compare(thiSinh t, thiSinh t1) {
                if (t.diemTB() != t1.diemTB()) {
                    if (t.diemTB() < t1.diemTB()) {
                        return 1;
                    }else {
                        return -1;
                    }
                }
                else {
                    return t.getMa().compareTo(t1.getMa());
                }
            }
        });
        for (thiSinh x : arr) {
            System.out.println(x);
        }
    }
}
