package Students;

/**
 * Created by DyXx on 20.02.2017.
 */
public class Student{
    private String name;
    private String surname;
    Container marks = new Container(0);

    public Student( String surname,String name) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
