package Animals;

public abstract class Wild extends Animal {
    public static final long serialVersionUID = 2L;
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
