package ru.stqa.ptf.sandbox;

public class CoordinateOnPlane {
  public static void main(String[] args) {
    Point first = new Point(1, 1);
    System.out.println("Координаты первой точки на плоскости " + "(" + first.x + "," + first.y + ")");

    Point second = new Point(1, 2);
    System.out.println("Координаты второй точки на плоскости " + "(" + second.x + "," + second.y + ")");

    System.out.println("Расстояние между точками " + "(" + first.x + "," + first.y + ")" + " и " + "(" + second.x + "," + second.y + ")" + " равно " + distance(first,second));


  }

  public static double distance(Point first, Point second) {
    return Math.sqrt((first.x - second.x) * (first.x - second.x) + (first.y - second.y) * (first.y - second.y));
  }
}
