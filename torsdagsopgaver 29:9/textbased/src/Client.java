import java.util.ArrayList;

public class Client {
    public Client(ArrayList<String> actions) { //4.D

    }

    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("Start game!");
        actions.add("Resume game!");
        actions.add("Pause game!");
        actions.add("End game!");
        System.out.print(actions.get(2));

        Client game = new Client(actions);
    }
}
