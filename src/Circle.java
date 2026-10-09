
public class Circle {

    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() { // pi x r x r
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() { // 2xpixr
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
