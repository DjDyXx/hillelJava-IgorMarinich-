package Animals;

public class Cat extends Domestic {
    public Cat(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    public String voice() {
        return super.voice() + "Meow";
    }
}