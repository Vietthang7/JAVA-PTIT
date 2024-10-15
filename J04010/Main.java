package J04010;

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
      double a = p1.distance(p3);
      double b = p1.distance(p2);
      double c = p3.distance(p2);
      if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
        double ncv = (a + b + c) / 2;
        double findArea = Math.sqrt(ncv * (ncv - a) * (ncv - b) * (ncv - c));
        double r = (a * b * c) / (4 * findArea);
        double result = Math.PI * r * r;
        System.out.println(String.format("%.3f", result));
      } else {
        System.out.println("INVALID");
      }
    }
  }
}
