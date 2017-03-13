/**
 * Created by DyXx on 11.03.2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius,2);
     }
}
