package J04001;

import java.util.Scanner;

class Point {
  public double x, y;

  public Point() {

  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point p) {

  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
  public double distance(Point secondPoint) {
    return Math.sqrt(Math.pow(secondPoint.x - this.x, 2) + Math.pow(secondPoint.y - this.y, 2));
  }

  public double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
  }

  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}

public class J04001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Point a = new Point(sc.nextDouble(), sc.nextDouble());
      Point b = new Point(sc.nextDouble(), sc.nextDouble());
      System.out.printf("%.4f\n", a.distance(b));
    }
  }
}
