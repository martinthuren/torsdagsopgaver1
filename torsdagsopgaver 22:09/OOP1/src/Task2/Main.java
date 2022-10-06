package Task2;

import Task1.Driver;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(1,2,3);
        Room room2 = new Room(2,4,6);
        Room room3 = new Room(3,6,9);

        //2.h
        ArrayList<Room> setOfRooms = new ArrayList<>();
        setOfRooms.add(room1);
        setOfRooms.add(room2);
        setOfRooms.add(room3);

        Building b1 = new Building(Room, 5, 7, 8, false);

        System.out.println(CountLoopsInBuilding(b1))
        System.out.println(isNormal(b1));

    }
    public static int sumOfLamps(Building b) {
        int sum = 0;
        for (Room r : b.getRoom()) {
            sum +=r.getNumberOfRooms();
        }
        return sum;

                public static boolean isNormal(Building b) {
            int floors = b.getNumberOfFloors();
            int rooms = b.getRooms().size();

            if(floors>rooms) {
                System.out.println("This building is odd");
                return false;
            }
            return true;
        }
    }
}
