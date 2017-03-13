/**
 * Created by DyXx on 11.03.2017.
 */
public abstract class Shape {
    private Paint paint;

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    abstract double calculateArea();

    public double calculatePaintSpent(){
        return calculateArea()*paint.getConsuptionPerSquare();
    }

    public double calculatePaintCost(){
        return paint.getPrice() * calculatePaintSpent();
    }
}
