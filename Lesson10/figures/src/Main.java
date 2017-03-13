/**
 * Created by DyXx on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        Triangle triangle = new Triangle(2,4,5);
        Square square = new Square(9);

        Paint orange = new Paint("Orange",0.8,25);
        Paint red = new Paint("Red",2.3,10);
        Paint blue = new Paint("Blue",0.3,50);

        circle.setPaint(orange);
        triangle.setPaint(red);
        square.setPaint(blue);

        ShapeCollection shapes = new ShapeCollection();

        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);

        System.out.println("Total Cost = "+shapes.totalCost());
        System.out.println("Total Paint Area = "+shapes.totalPaintArea());
        System.out.println("Total Paint Spent = "+shapes.totalPaintSpent());
    }
}
