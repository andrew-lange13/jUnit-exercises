import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public long id;
    public String name;
    public ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, long id){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }


}
