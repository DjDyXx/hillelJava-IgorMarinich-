/**
 * Created by DyXx on 25.02.2017.
 */
public abstract class Domestic extends Animal {
    private String name;
    private boolean isVactinated;

    public Domestic(int id, int age, int weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVactinated() {
        return isVactinated;
    }

    public void setVactinated(boolean vactinated) {
        isVactinated = vactinated;
    }

    public String voice() {
        if (isVactinated()) {
            return super.voice() + "my name is " + this.name + " and I'm vactinated.";
        } else {
            return super.voice() + "my name is " + this.name + ".";
        }
    }

}
