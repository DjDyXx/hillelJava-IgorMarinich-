package Animals;

public class GuideDog extends Domestic {
    public static final long serialVersionUID = 35L;
    private boolean isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVactinated, boolean isTrained) {
        super(id, age, weight, color, name, isVactinated);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public String voice() {
        return super.voice()+ " I can take you home.";
    }
}
