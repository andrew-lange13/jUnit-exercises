import java.util.ArrayList;

public class Student {

    protected long id;
    protected String name;
    protected ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, long id){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }



}
