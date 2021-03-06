package Animals;
import java.io.Serializable;

/**
 * Created by DyXx on 12.04.2017.
 */
public abstract class Animal implements Serializable {
    public static final long serialVersionUID = 1L;
    private int id;
    private int age;
    private int weight;
    private String color;

    public Animal(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String voice() {
        return "Hello , ";
    }
}