package chnu.edu.kn.rotar;

import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author   katya
  @project   Lab2_testing
  @class  CircleTest
  @version  1.0.0 
  @since 26.09.2025 - 13.00
*/public class CircleTest {

    @Test
    public void area() {
        Circle circle = new Circle(3, 0, 0);
        double area = circle.area();
        assertEquals(28.27, area, 0.01);
    }

    @Test
    public void circumference() {
        Circle circle = new Circle(3, 0, 0);
        double circumference = circle.circumference();
        assertEquals(18.84, circumference, 0.01);
    }

    @Test
    public void diameter() {
        Circle circle = new Circle(3, 0, 0);
        double diameter = circle.diameter();
        assertEquals(6, diameter, 0.01);
    }

    @Test
    public void containsPoint() {
        Circle circle = new Circle(5, 0, 0);
        boolean point1 = circle.containsPoint(3, 4); // точка на межі (3²+4²=25=r²)
        boolean point2 = circle.containsPoint(6, 0);  // точка поза колом
        assertTrue(point1);
        assertFalse(point2);
    }

    @Test
    public void arcLength() {
        Circle circle = new Circle(10, 0, 0);
        double arcLength = circle.arcLength(180);
        assertEquals(31.4,arcLength, 0.1); // півколо
    }

    @Test
    public void sectorArea() {
        Circle circle = new Circle(10, 0, 0);
        double sectorArea = circle.sectorArea(180);
        assertEquals(157.0, sectorArea, 0.1); // півколо
    }
}