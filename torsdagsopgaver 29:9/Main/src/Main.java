import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //name
        Scanner myName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please type your name");

        String name = myName.nextLine();  // Read user input
        System.out.println("Username is: " + name);

        //age
        Scanner myAge = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please type your age");

        int age = Integer.parseInt(myAge.nextLine());  // Read user input
        System.out.println("Age is: " + age);

        //retirement
        System.out.println("You can retire in :"); System.out.println(67-age);
        System.out.println("years");
        }
    }

