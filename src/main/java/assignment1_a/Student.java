package assignment1_a;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 *
 * @author sam
 */
public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private String username;
    private String id;
    private ArrayList<String> courses;
    private ArrayList<Module> modules;
    
    public Student(String name, DateTime dob, String id) {
        this.name = name;
        this.dob = dob;
        this.id = id;
    }
    
    public String getName() {
        return name; 
    }
    
    public DateTime getDob() {
        return dob;
    }
    
    public String getId() {
        return id;
    }
    
    public int getAge() {
        DateTime now = new DateTime();
        Period period = new Period(dob,now);
        return period.getYears();
    }
}
