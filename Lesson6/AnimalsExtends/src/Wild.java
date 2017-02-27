/**
 * Created by DyXx on 25.02.2017.
 */
public abstract class Wild extends Animal {
    private boolean isPredator;

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public String voice(){
        if(isPredator()){
            return super.voice()+"I am a wild animal and I am angry.";
        }else{
            return super.voice()+"I am a wild animal.";
        }
    }
}
