package ru.stqa.ptf.sandbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  public double distance(Point second) {
    return Math.sqrt((this.x - second.x) * (this.x - second.x) + (this.y - second.y) * (this.y - second.y));
  }
}
