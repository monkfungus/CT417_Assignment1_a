package assignment1_a;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.joda.time.DateTime;

/**
 *
 * @author sam
 */
public class ModuleTest {
    @Test
    public void testConstrucorArguments() {
        String name = "CS101";
        String id = "123";
        Module m = new Module(name, id);
        
        assertEquals(name, m.getName());
        assertEquals(id, m.getId());
    }
    
    @Test
    public void testSetName() {
        String expectedName = "CT417";
        Module m = new Module("CS101", "123");
        m.setName(expectedName);
        
        assertEquals(expectedName, m.getName());
    }
    
    @Test
    public void testSetId() {
        String expectedId = "abc";
        Module m = new Module("CS101", "123");
        m.setId(expectedId);
        
        assertEquals(expectedId, m.getId());
    }
    
    @Test
    public void testGetSetStudents() {
        Module m = new Module("CS101", "123");
        Student s = new Student("Tim", new DateTime(), "abc");
        
        assertEquals(0, m.getStudents().size());
        
        m.addStudent(s);
        assertEquals(1, m.getStudents().size());
    }
    
    @Test
    public void testGetSetCourses() {
        Course c =  new Course("ECE", new DateTime(2015, 1, 1, 0, 0), new DateTime());
        Module m = new Module("CS101", "123");
        
        assertEquals(0, m.getCourses().size());
        
        m.addCourse(c);
        assertEquals(1, m.getCourses().size());
    }
    
    @Test
    public void testAddCourses() {
        int expectedNumCourses = 2;
        Course c1 = new Course("ECE", new DateTime(), new DateTime());
        Course c2 = new Course("EEE", new DateTime(), new DateTime());
        Module m = new Module("CS101", "123");
        
        m.addCourse(c1);
        m.addCourse(c2);
        
        assertEquals(expectedNumCourses, m.getCourses().size());
    }
    
    @Test
    public void testAddDuplicateCourse() {
        int expectedNumCourses = 1;
        Course c = new Course("ECE", new DateTime(), new DateTime());
        Module m = new Module("CS101", "123");
        
        m.addCourse(c);
        m.addCourse(c);
        
        assertEquals(expectedNumCourses, m.getCourses().size());
    }
    
    @Test
    public void testRemoveCourse() {
        int expectedNumCourses = 1;
        Course c1 = new Course("ECE", new DateTime(), new DateTime());
        Course c2 = new Course("EEE", new DateTime(), new DateTime());
        Module m = new Module("CS101", "123");
        
        m.addCourse(c1);
        m.addCourse(c2);
        m.removeCourse(c2);
        
        assertEquals(expectedNumCourses, m.getCourses().size());
    }
}
