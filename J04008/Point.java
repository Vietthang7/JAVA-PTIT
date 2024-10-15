package J04008;

public class Point {
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
