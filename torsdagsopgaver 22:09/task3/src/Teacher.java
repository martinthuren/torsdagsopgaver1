import java.util.ArrayList;

public class Teacher extends Person {

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    ArrayList<String> canTeach = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();

    @Override

    public boolean addCourse(String course) {
        for (String s : canTeach) {
            if (s.equalsIgnoreCase(course)) {
                return false;
            }

        }
        currentCourses.add(course);
        return true;

    }
}