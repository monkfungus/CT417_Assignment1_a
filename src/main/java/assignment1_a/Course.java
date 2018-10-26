package assignment1_a;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 * TODO: start not after end in constructor and setters
 * TODO: getCourseDuration
 * @author sam
 */
public class Course {
    private String name;
    private DateTime start;
    private DateTime end;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    
    public Course(String name, DateTime start, DateTime end) {
       this.name = name;
       this.start = start;
       this.end = end;
       students = new ArrayList<Student>();
       modules = new ArrayList<Module>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public DateTime getStart() {
        return start;
    }
    
    public void setStart(DateTime newStart) {
        start = newStart;
    }
    
    public DateTime getEnd() {
        return end;
    }
    
    public void setEnd(DateTime newEnd) {
        end = newEnd;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
    
    public ArrayList<Module> getModules() {
        return modules;
    }
    
    public void addModule(Module m) {
        modules.add(m);
    }
}
