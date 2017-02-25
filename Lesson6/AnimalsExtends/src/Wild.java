import java.util.Objects;

/**
 * Created by DyXx on 25.02.2017.
 */
public class Wild extends Animal{
    private boolean isPredator;

    public Wild(boolean isPredator) {
        this.isPredator = isPredator;
    }

    @Override
    public void voice() {
        System.out.print("Hello , I am a wild animal");
        if (this.isPredator){
            System.out.print(" and I am angry ");
        }
    }
}
