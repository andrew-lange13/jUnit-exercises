import org.junit.Assert;
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

}
