package assignment1_a;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * TODO: add courses and modules getters/setters
 * TODO: need to sync modules and courses and students together
 * @author sam
 */
public class Student {
    private String name;
    private DateTime dob;
    private String id;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;
    
    public Student(String name, DateTime dob, String id) {
        this.name = name;
        this.dob = dob;
        this.id = id;
        courses = new ArrayList<Course>();
        modules = new ArrayList<Module>();
    }
    
    public String getName() {
        return name; 
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public DateTime getDob() {
        return dob;
    }
    
    public void setDob(DateTime newDob) {
        dob = newDob;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String newId) {
        id = newId;
    }
    
    public int getAge() {
        DateTime now = new DateTime();
        Period period = new Period(dob,now);
        return period.getYears();
    }
    
    public String getUsername() {
        return name + getAge();
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public void addCourse(Course newC) {
        boolean addCourse = true; // default
        for (Course c : courses) {
            if (c.getName().equals(newC.getName())) {
                addCourse = false;
            }
        }
        if (addCourse) {
            courses.add(newC);
        }
    }
    
    public void removeCourse(Course rmC) {
        boolean removeCourse = false; // default
        for (Course c : courses) {
            if (c.getName().equals(rmC.getName())) {
                removeCourse = true;
            }
        }
        if (removeCourse) {
            courses.remove(rmC);
        }
    }
    
    public ArrayList<Module> getModules() {
        return modules;
    }
    
    public void addModule(Module newM) {
        boolean add = true; // default
        for (Module m : modules) {
            if (m.getId().equals(newM.getId())) {
                add = false;
            }
        }
        if (add) {
            modules.add(newM);
        }
    }
    
    public void removeModule(Module toRm) {
        boolean rm = false; // default
        for (Module m : modules) {
            if (m.getId().equals(toRm.getId())) {
                rm = true;
            }
        }
        if (rm) {
            modules.remove(toRm);
        }
    }
}
