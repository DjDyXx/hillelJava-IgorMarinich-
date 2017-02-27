/**
 * Created by DyXx on 25.02.2017.
 * возвращается строка,
 * у всех начинается “Hello, ”,
 * если есть имя  “my name is <name>.”
 * если дикое “I am a wild animal”
 * если хищник “ and I am angry ”
 * если собака “Woof”
 * если кот “Meow”
 * если собака-поводырь и дрессированная “I can take you home.”
 * рыбка отличается от всех ее реплика “....”
 */
public class Animal {
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
