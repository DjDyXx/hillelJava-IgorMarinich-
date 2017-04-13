package Animals;

public class Hamster extends Domestic {
    public static final long serialVersionUID = 36L;
    private boolean isSportsman;

    public Hamster(int id, int age, int weight, String color, String name, boolean isVactinated, boolean isSportsman) {
        super(id, age, weight, color, name, isVactinated);
        this.isSportsman = isSportsman;
    }

    public boolean isSportsman() {
        return isSportsman;
    }

    public void setSportsman(boolean sportsman) {
        isSportsman = sportsman;
    }

    public String voice(){
        if (isSportsman()){
            return super.voice()+" and I can run on the wheel. Ph-phh. ";
        }else
            return super.voice();
    }
}