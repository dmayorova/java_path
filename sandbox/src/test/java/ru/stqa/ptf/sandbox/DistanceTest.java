package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.ptf.sandbox.CoordinateOnPlane.distance;

public class DistanceTest {

  @Test
  public void testDistance1() {
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(1.0, 1.0);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }
  @Test
  public void testDistance11() {
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(1.0, 1.0);
    Assert.assertEquals(distance(p1,p2), 0.0);
  }
  @Test
  public void testDistance2() {
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(-2.0, -3.0);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }
  @Test
  public void testDistance3() {
    Point p1 = new Point(3.0, 0);
    Point p2 = new Point(0.0, 4.0);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }
  @Test
  public void testDistance4() {
    Point p1 = new Point(1.12, -1.34);
    Point p2 = new Point(-2.34, 3.45);
    Assert.assertTrue(p1.distance(p2)>=0);
  }
}
