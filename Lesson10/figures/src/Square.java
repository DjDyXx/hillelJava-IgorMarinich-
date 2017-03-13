/**
 * Created by DyXx on 11.03.2017.
 */
public class Square extends Shape{
    private double sideLength;

    public Square(double sizeLength) {
        this.sideLength = sizeLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

}
