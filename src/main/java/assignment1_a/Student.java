package assignment1_a;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * TODO: add courses and modules getters/setters
 * @author sam
 */
public class Student {
    private String name;
    private DateTime dob;
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
}
