package assignment1_a;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test Student
 * @author sam
 */
public class StudentTest {
    @Test
    public void testConstructorArguments() {
        String name = "Tim";
        String dob = "21/12/1996";
        String id = "abc123";
        
        Student student = new Student(name, dob, id);
        assertEquals(name, student.getName());
        assertEquals(dob, student.getDob());
        assertEquals(id, student.getId());
    }
}
