package Task2;

import java.util.ArrayList;


public class Building {

    private final ArrayList<Room> Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding,ArrayList<Room> Rooms) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.Rooms = Rooms;



    }
}


