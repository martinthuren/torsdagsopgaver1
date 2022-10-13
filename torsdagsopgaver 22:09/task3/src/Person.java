abstract class Person {

    String name;

    //Constructor
    public String getName() {
        return name;
    }

    //Getter
    public void setName(String name) {
        this.name = name;
    }

    //Setter
    public Person(String name) {
        this.name = name;

    }

    //Public boolean
    abstract boolean  addCourse(String course);
}