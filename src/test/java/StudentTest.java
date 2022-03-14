import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {


    @Test
    public void createTest(){
        Student bob = new Student("bob", 46);
        assertNotNull(bob);
    }

    @Test
    public void methodsTest(){
        Student bob = new Student("bob", 46);
        assertEquals(46, bob.getId());
        assertEquals("bob", bob.getName());
        assertTrue(bob.getGrades() instanceof ArrayList<Integer>);
    }

    @Test
    public void addGradeTest(){
        Student bob = new Student("bob", 13);
        bob.addGrade(76);
        bob.addGrade(78);
        assertSame(76, bob.getGrades().get(0));
        assertSame(78, bob.getGrades().get(1));
    }

    @Test
    public void averageTest(){
        Student bob = new Student("bob", 13);
        bob.addGrade(76);
        bob.addGrade(78);
        assertEquals(77, bob.getGradeAverage(), 0);
    }

}
