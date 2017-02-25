/**
 * Created by DyXx on 25.02.2017.
 */
public class Domestic extends Animal {
    private String name;
    private boolean isVactinated;

    @Override
    public void voice() {
        System.out.print("Hello, ");
        if (name!=null){
            System.out.println("my name is" + this.name);
        }
    }
}
