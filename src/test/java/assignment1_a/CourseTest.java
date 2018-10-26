package assignment1_a;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.joda.time.DateTime;

/**
 * 
 * @author sam
 */
public class CourseTest {
    @Test
    public void testConstructorArguments() {
        String name = "ECE";
        DateTime start = new DateTime(2015, 1, 1, 0, 0);
        DateTime end = new DateTime(2019, 1, 1, 0, 0);
        
        Course c = new Course(name, start, end);
        assertEquals(name, c.getName());
        assertEquals(start, c.getStart());
        assertEquals(end, c.getEnd());
    }
    
    @Test
    public void testSetName() {
        String expectedName = "EEE";
        DateTime start = new DateTime(2015, 1, 1, 0, 0);
        DateTime end = new DateTime(2019, 1, 1, 0, 0);
        Course c = new Course("ECE", start, end);
        c.setName(expectedName);
        
        assertEquals(expectedName, c.getName());
    }
    
    @Test
    public void testSetStart() {
        DateTime start = new DateTime(2015, 1, 1, 0, 0);
        DateTime end = new DateTime(2019, 1, 1, 0, 0);
        DateTime expectedStart = new DateTime(2016, 1, 1, 0, 0);
        Course c = new Course("ECE", start, end);
        c.setStart(expectedStart);
        
        assertEquals(expectedStart, c.getStart());
    }
    
    @Test
    public void testSetEnd() {
        DateTime start = new DateTime(2015, 1, 1, 0, 0);
        DateTime end = new DateTime(2019, 1, 1, 0, 0);
        DateTime expectedEnd = new DateTime(2018, 1, 1, 0, 0);
        Course c = new Course("ECE", start, end);
        c.setEnd(expectedEnd);
        
        assertEquals(expectedEnd, c.getEnd());
    }
    
    @Test
    public void testGetSetStudents() {
        Student s = new Student("Tim", new DateTime(), "abc");
        DateTime start = new DateTime(2015, 1, 1, 0, 0);
        DateTime end = new DateTime(2019, 1, 1, 0, 0);
        Course c = new Course("ECE", start, end);
        
        assertEquals(0, c.getStudents().size());
        
        c.addStudent(s);
        assertEquals(1, c.getStudents().size());
    }
    
    @Test
    public void testGetSetModules() {
        Module m = new Module("CS101", "abc");
        DateTime start = new DateTime(2015, 1, 1, 0, 0);
        DateTime end = new DateTime(2019, 1, 1, 0, 0);
        Course c = new Course("ECE", start, end);
        
        assertEquals(0, c.getModules().size());
        
        c.addModule(m);
        assertEquals(1, c.getModules().size());
    }
}
