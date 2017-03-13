/**
 * Created by DyXx on 11.03.2017.
 */
public class Paint {
    private final String colorName;
    private final double consuptionPerSquare;
    private final double price;

    public Paint(String colorName, double consuptionPerSquare, double price) {
        this.colorName = colorName;
        this.consuptionPerSquare = consuptionPerSquare;
        this.price = price;
    }

    public String getColorName() {
        return colorName;
    }

    public double getConsuptionPerSquare() {
        return consuptionPerSquare;
    }

    public double getPrice() {
        return price;
    }
}
