/**
 * Created by DyXx on 11.03.2017.
 */
public class Triangle extends Shape {
    private double aSide;
    private double bSide;
    private double cSide;
    private double halfPerimeter = (aSide+bSide+cSide)/2;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(halfPerimeter*(halfPerimeter-aSide)*(halfPerimeter-bSide)*(halfPerimeter-cSide));
    }

}
