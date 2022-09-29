import java.util.ArrayList;

public class Student {
    private String name; //1.B
    private ArrayList<String> Course = new ArrayList<String>(); //1.B
Course.add("Math");

    //constructor
    public Student(String name) { //1.C
        this.name = name;
        this.Course = Course;
    }

    static String addCourse(String name, String Course) {
        Student a = new Student("Martin");

        System.out.println(a);
        System.out.println(a.toString());

        public String toString() {
            return "Student: " + name + ", course: " + Course;
        }

        }

    }

