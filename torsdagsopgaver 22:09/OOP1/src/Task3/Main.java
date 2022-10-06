package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
            customers.add(new Customer("Rasmus", "Arendt", "Dadcake"));
            customers.add(new Customer("Philip", "Hatley", "Kish"));
            customers.add(new Customer("Martin", "Thuren", "BatKnob"));
            customers.add(new Customer("Nicolaj", "Rosendahl", "Ashermagus"));
            customers.add(new Customer("Marcus", "Løbel", "GigaScrub"));
            customers.add(new Customer("Victor", "Christensen", "C-Cat"));
    printCustomers();
    }

        //3.d
        public static void printCustomers() {
            for (Customer c : customers) {
                System.out.println(c);

            }


        }
    }

