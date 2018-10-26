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
    
    public void addStudent(Student s) {
        students.add(s);
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public void addCourse(Course c) {
        courses.add(c);
    }
}
