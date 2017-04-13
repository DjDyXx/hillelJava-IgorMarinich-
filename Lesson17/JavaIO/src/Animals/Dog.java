package Animals;

public class Dog extends Domestic {
    public static final long serialVersionUID = 31L;
    public Dog(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    public String voice(){
        return super.voice() + " Woof ";
    }
}