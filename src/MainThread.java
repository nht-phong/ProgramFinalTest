import java.util.Scanner;

public class MainThread {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("EX 1: Circle");

        Circle c = new Circle(sc.nextDouble());
        
        System.out.println("==================================");
        System.out.println("  Radius: " + c.getRadius()+"      I");
        System.out.println("  Area: " + c.getArea()+"          I");
        System.out.println("  Perimeter: " + c.getPerimeter()+"I");
        System.out.println("==================================");
    }
}
