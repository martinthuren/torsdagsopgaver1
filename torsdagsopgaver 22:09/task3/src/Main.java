import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<String> courses1 = new ArrayList<>();
        courses.add("SoftwareDevelopment");
        courses1.add("Philosophy");

        person.add(new Student( "Philip", courses));
        person.add(new Student( "Martin", courses));
        person.add(new Teacher( "Tess", courses));
        person.add(new Teacher( "Signe", courses1));

        for (Person p : person){
            p.addCourse("Softwaredevelopment");
        }
    }
}