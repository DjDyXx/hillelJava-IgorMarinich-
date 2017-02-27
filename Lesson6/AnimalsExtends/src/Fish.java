/**
 * Created by DyXx on 25.02.2017.
 */
public class Fish extends Domestic {
    public Fish(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }
    @Override
    public String voice(){
        return "...";
    }
}
