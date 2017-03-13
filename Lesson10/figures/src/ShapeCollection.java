import java.util.ArrayList;
import java.util.List;

/**
 * Created by DyXx on 11.03.2017.
 */
public class ShapeCollection {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public double totalCost() {
        double total = 0;
        for (Shape shape : shapes){
            total+= shape.calculatePaintCost();
        }
        return total;
    }


    public double totalPaintSpent() {
        double total = 0;
        for (Shape shape : shapes){
            total+= shape.calculatePaintSpent();
        }
        return total;
    }


    public double totalPaintArea() {
        double total = 0;
        for (Shape shape : shapes){
            total+= shape.calculateArea();
        }
        return total;
    }
}
