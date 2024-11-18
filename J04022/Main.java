package J04022;

import java.util.*;

class WordSet {
  private String s;
  private TreeSet<String> set = new TreeSet<>();

  public WordSet(String s) {
    String[] a = s.trim().split("\\s+");
    for (String x : a) {
      StringBuilder sb = new StringBuilder("");
      sb.append(Character.toLowerCase(x.charAt(0)));
      for (int i = 1; i < x.length(); i++) {
        sb.append(Character.toLowerCase(x.charAt(i)));
      }
      set.add(sb.toString());
    }
    this.s = s;
  }

  public WordSet union(WordSet b) {
    TreeSet<String> res = new TreeSet<>();
    StringBuilder sb = new StringBuilder("");
    for (String x : this.set) {
      res.add(x);
    }
    for (String x : b.set) {
      res.add(x);
    }
    for (String x : res) {
      sb.append(x);
      sb.append(" ");
    }
    return new WordSet(sb.toString());
  }

  public WordSet intersection(WordSet b) {
    TreeSet<String> res = new TreeSet<>();
    StringBuilder sb = new StringBuilder();
    for (String x : b.set) {
      if (this.set.contains(x)) {
        res.add(x);
      }
    }
    for (String x : res) {
      sb.append(x);
      sb.append(" ");
    }
    return new WordSet(sb.toString());
  }

  public String toString() {
    return this.s;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    WordSet s1 = new WordSet(in.nextLine());
    WordSet s2 = new WordSet(in.nextLine());
    System.out.println(s1.union(s2));
    System.out.println(s1.intersection(s2));
  }
}