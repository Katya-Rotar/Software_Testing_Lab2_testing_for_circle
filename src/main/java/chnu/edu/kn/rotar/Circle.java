package chnu.edu.kn.rotar;

/*
  @author   katya
  @project   Lab2_testing
  @class  Circle
  @version  1.0.0 
  @since 26.09.2025 - 12.45
*/public class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    // 1. Площа кола
    public double area() {
        return Math.PI * radius * radius;
    }

    // 2. Довжина кола (периметр)
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // 3. Діаметр
    public double diameter() {
        return 2 * radius;
    }

    // 4. Перевірка, чи точка належить колу
    public boolean containsPoint(double x, double y) {
        double dx = x - centerX;
        double dy = y - centerY;
        return dx * dx + dy * dy <= radius * radius;
    }

    // 5. Довжина дуги за кутом (у градусах)
    public double arcLength(double angleInDegrees) {
        return circumference() * (angleInDegrees / 360.0);
    }

    // 6. Площа сектора за кутом (у градусах)
    public double sectorArea(double angleInDegrees) {
        return area() * (angleInDegrees / 360.0);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                '}';
    }
}
