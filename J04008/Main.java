package J04008;

import java.util.*;

class Point {
  private double x, y;

  public Point() {

  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distance(Point secondPoint) {
    return Math.sqrt(Math.pow((secondPoint.x - this.x), 2) + Math.pow((secondPoint.y - this.y), 2));
  }

  public double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
  }

  public String toString() {
    return "Point{" + "x=" + x + ",y=" + y + "}";
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
      Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
      Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
      double a = p1.distance(p2);
      double b = p1.distance(p3);
      double c = p2.distance(p3);

      if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
        System.out.println(String.format("%.3f", a + b + c));
      } else {
        System.out.println("INVALID");
      }
    }
  }
}
