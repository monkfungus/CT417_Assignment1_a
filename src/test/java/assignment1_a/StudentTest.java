package assignment1_a;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.joda.time.DateTime;

/**
 * Unit test Student
 * @author sam
 */
public class StudentTest {
    @Test
    public void testConstructorArguments() {
        String name = "Tim";
        DateTime dob = new DateTime(1996, 12, 21, 5, 32);
        String id = "abc123";
        Student student = new Student(name, dob, id);
        
        assertEquals(name, student.getName());
        assertEquals(dob, student.getDob());
        assertEquals(id, student.getId());
    }
    
    @Test 
    public void testGetAge() {
        DateTime dob = new DateTime(1996, 12, 21, 5, 32);
        int expectedAge = 21;
        Student student = new Student("name", dob, "id");
        
        assertEquals(expectedAge, student.getAge());
    }
}
