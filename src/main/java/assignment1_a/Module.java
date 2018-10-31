package assignment1_a;

import java.util.ArrayList;

/**
 * TODO: remove student, module, no duplicate modules, students
 * @author sam
 */
public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    
    public Module(String name, String id) {
        this.name = name;
        this.id = id;
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String newId) {
        id = newId;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student newS) {
        boolean add = true; // default
        for (Student s : students) {
            if (s.getUsername().equals(newS.getUsername())) {
                add = false;
            }
        }
        if (add) {
            students.add(newS);
        }
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
}
