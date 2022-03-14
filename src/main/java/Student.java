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

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
}
