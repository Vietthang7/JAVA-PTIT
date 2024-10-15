
import java.util.*;
import java.io.*;

public class J07001 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("OUTPUT.out"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            System.out.println(s);
            writer.write(s);
            writer.newLine();
        }
    }
}
