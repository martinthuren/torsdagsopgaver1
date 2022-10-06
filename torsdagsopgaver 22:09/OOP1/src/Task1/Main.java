package Task1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(" Martin",22);
        Car myCar = new Car(2007,"BMW",208,"Family");
        myCar.setDriver(driver);
        System.out.println(myCar);
        System.out.println(driver);
    }
}