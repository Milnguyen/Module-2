public class Circle {
    private double radius = 1.0;
    private String color = "red";

    // Constructor không tham số
    public Circle() {
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức public
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
