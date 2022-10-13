import java.util.ArrayList;
public class Student extends Person {

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    ArrayList<String> passedCourses = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();

    @Override
    public boolean addCourse(String course) {
        for (String s : passedCourses) {
            if (s.equalsIgnoreCase(course)) {
                System.out.println(name + "has already passed this course");
                return false;
            }

        }
        currentCourses.add(course);
        System.out.println(name + "has been added to" + course);
        return true;
    }

}