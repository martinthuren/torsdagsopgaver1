import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class Menu {

            private ArrayList<String> options = new ArrayList<String>();

            public Menu(ArrayList<String> options) {
                options.add("Start game!");
                options.add("Resume game!");
                options.add("Pause game!");
                options.add("End game!");
                System.out.println(options.get(2));
            }

            private void showMenu() {
                System.out.println("Type a number to choose");

                for (int i = 0; i < options.size();i++)
                {
                    System.out.println(options.get(i));
                }
                Scanner scan = new Scanner(System.in);
                String choice = scan.nextLine();

            }
        }
    }
}
