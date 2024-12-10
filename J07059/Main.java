package J07059;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/Users/Admin/OneDrive/Desktop/JAVA_PTIT/Java/src/J07059/CATHI.in"));
        PrintWriter pw = new PrintWriter(new File("C:/Users/Admin/OneDrive/Desktop/JAVA_PTIT/Java/src/J07059/Output.out"));
        ArrayList<caThi> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            arr.add(new caThi("C" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<caThi>() {
            public int compare(caThi t, caThi t1) {
                if (t.ngayThi().compareTo(t1.ngayThi()) != 0) {
                    return t.ngayThi().compareTo(t1.ngayThi());
                } else {
                    if (t.getGioThi().compareTo(t1.getGioThi()) != 0) {
                        return t.getGioThi().compareTo(t1.getGioThi());
                    } else {
                        return t.getMa().compareTo(t1.getMa());
                    }
                }
            }
        });
        for (caThi x : arr) {
            pw.println(x);
        }
        pw.close(); // Đóng PrintWriter để đảm bảo dữ liệu được ghi vào file
        sc.close(); // Đóng Scanner

    }
}
