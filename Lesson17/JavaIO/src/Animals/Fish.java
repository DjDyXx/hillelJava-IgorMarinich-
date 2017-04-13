package Animals;

public class Fish extends Domestic {
    public static final long serialVersionUID = 33L;
    public Fish(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }
    @Override
    public String voice(){
        return "...";
    }
}