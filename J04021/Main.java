package J04021;

import java.util.*;
import java.util.TreeSet;

class IntSet {
  private TreeSet<Integer> set = new TreeSet<>();

  public IntSet() {
  }

  public IntSet(int[] a) {
    for (int i = 0; i < a.length; i++) {
      set.add(a[i]);
    }
  }

  public IntSet union(IntSet b) {
    IntSet res = new IntSet();
    for (int x : this.set) {
      res.set.add(x);
    }
    for (int x : b.set) {
      res.set.add(x);
    }
    return res;
  }

  public String toString() {
    String res = "";
    for (int x : this.set) {
      res += x + " ";
    }
    return res;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
    for (int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    for (int i = 0; i < m; i++)
      b[i] = sc.nextInt();
    IntSet s1 = new IntSet(a);
    IntSet s2 = new IntSet(b);
    IntSet s3 = s1.union(s2);
    System.out.println(s3);
  }
}
