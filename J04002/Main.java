package J04002;

import java.util.*;

 class Rectange {
  private double width, height;
  String color;

  public Rectange() {

  }

  public Rectange(double width, double height, String color) {
    this.width = width;
    this.height = height;
    this.color = color;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String format() {
    String color = getColor();
    String res = "";
    res += Character.toUpperCase(color.charAt(0));
    for (int i = 1; i < color.length(); i++) {
      res += Character.toLowerCase(color.charAt(i));
    }
    return res;
  }


  public double findArea() {
    return this.width * this.height;
  }

  public double findPerimeter() {
    return (this.height + this.width) * 2;
  }

  public String toString() {
    return (int) findPerimeter() + " " + (int) findArea() + " " + format();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double w = sc.nextDouble();
    double h = sc.nextDouble();
    String c = sc.next();
    if (w <= 0 || h <= 0) {
      System.out.println("INVALID");
    } else {
      Rectange t = new Rectange(w, h, c);
      System.out.println(t);
    }

  }
}