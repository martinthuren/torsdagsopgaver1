package Task1;

public class Car {

    private int year;
    private String make;
    private int model;
    private String bodyStyle;
    private Driver driver;

    //1.d
    public Car(int year, String make, int model, String bodyStyle) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        }

        //1.e
    public Driver getDriver() {
        return driver;
    }
        //1.e
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
//1.f
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model=" + model +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}

