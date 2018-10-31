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
    
    @Test
    public void testSetName() {
        String expectedName = "Tim";
        Student student = new Student("Timmothy", new DateTime(), "id");
        student.setName(expectedName);
        
        assertEquals(expectedName, student.getName());
    }
    
    @Test
    public void testSetDob() {
        DateTime expectedDob = new DateTime(1996, 11, 21, 4, 23);
        Student student = new Student("Tim", new DateTime(), "id");
        student.setDob(expectedDob);
        
        assertEquals(expectedDob, student.getDob());
    }
    
    @Test
    public void testSetId() {
        String expectedId = "123";
        Student student = new Student("Tim", new DateTime(), "abc");
        student.setId(expectedId);
        
        assertEquals(expectedId, student.getId());
    }
    
    @Test 
    public void testGetUsername() {
        String name = "Tim";
        DateTime dob = new DateTime(1996, 1, 1, 12, 45);
        Student student = new Student(name, dob, "123");
        String expectedUsername = name + student.getAge();
        
        assertEquals(expectedUsername, student.getUsername());
    }
    
    @Test
    public void testAddCourses() {
        int expectedNumCourses = 2;
        Course c1 = new Course("ECE", new DateTime(), new DateTime());
        Course c2 = new Course("EEE", new DateTime(), new DateTime());
        Student s = new Student("Tim", new DateTime(), "123");
        
        s.addCourse(c1);
        s.addCourse(c2);
        
        assertEquals(expectedNumCourses, s.getCourses().size());
    }
    
    @Test
    public void testAddDuplicateCourse() {
        int expectedNumCourses = 1;
        Course c = new Course("ECE", new DateTime(), new DateTime());
        Student s = new Student("Tim", new DateTime(), "123");
        
        s.addCourse(c);
        s.addCourse(c);
        
        assertEquals(expectedNumCourses, s.getCourses().size());
    }
    
    @Test
    public void testRemoveCourse() {
        int expectedNumCourses = 1;
        Course c1 = new Course("ECE", new DateTime(), new DateTime());
        Course c2 = new Course("EEE", new DateTime(), new DateTime());
        Student s = new Student("Tim", new DateTime(), "123");
        
        s.addCourse(c1);
        s.addCourse(c2);
        s.removeCourse(c2);
        
        assertEquals(expectedNumCourses, s.getCourses().size());
    }
    
    @Test
    public void testAddModules() {
        int expectedNumModules = 2;
        Module m1 = new Module("CS101", "001");
        Module m2 = new Module("CS102", "002");
        Student s = new Student("Tim", new DateTime(), "123");
        
        s.addModule(m1);
        s.addModule(m2);
        
        assertEquals(expectedNumModules, s.getModules().size());
    }
    
    @Test
    public void testAddDuplicateModule() {
        int expectedNumModules = 1;
        Module m = new Module("CS101", "001");
        Student s = new Student("Tim", new DateTime(), "123");
        
        s.addModule(m);
        s.addModule(m);
        
        assertEquals(expectedNumModules, s.getModules().size());
    }
    
    @Test
    public void testRemoveModule() {
        int expectedNumModules = 1;
        Module m1 = new Module("CS101", "001");
        Module m2 = new Module("CS102", "002");
        Student s = new Student("Tim", new DateTime(), "123");
        
        s.addModule(m1);
        s.addModule(m2);
        s.removeModule(m2);
        
        assertEquals(expectedNumModules, s.getModules().size());
    }
    
}
