package J04019;

import java.util.*;

class Point {
  private double x, y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static Point nextPoint(Scanner sc) {
    return new Point(sc.nextDouble(), sc.nextDouble());
  }

  public double distance(Point secondPoint) {
    return Math.sqrt(Math.pow((secondPoint.x - this.x), 2) + Math.pow((secondPoint.y - this.y), 2));
  }
}

class Triangle {
  private double a, b, c;

  public Triangle(Point a, Point b, Point c) {
    this.a = a.distance(b);
    this.b = b.distance(c);
    this.c = c.distance(a);
  }

  public boolean valid() {
    return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
  }

  public String getPerimeter() {
    double res = a + b + c;
    return String.format("%.3f", res);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
      if (!a.valid()) {
        System.out.println("INVALID");
      } else {
        System.out.println(a.getPerimeter());
      }
    }
  }
}
