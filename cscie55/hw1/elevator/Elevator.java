package cscie55.hw1.elevator;
/**
* Author Sarah L Duncan
* Version: 1.0
* Elevator.java
* Purpose: Simulate an elevator
* Methods: 
* move: move the elevator one floor
* boardPassenger: add a passenger
* toString: print useful information
*/
public class Elevator {
    /* define instance variables */
    private static final int totalFloors = 7;
    private static final int groundFloor = 1;
    private int currentFloor;
    private int travelDirection;
    private int[] passengersForFloor;
    private int totalPassengers;

    public Elevator( int currentFloor, int travelDirection, int[] passengersForFloor)
    {
	this.currentFloor=currentFloor;
	this.travelDirection=travelDirection;
	this.passengersForFloor = passengersForFloor;
    }

    public String toString ()
    {
	for (int i=(groundFloor-1); i < totalFloors; i++) {
	totalPassengers += this.passengersForFloor[i];
	}
	if (totalFloors == 1)
	    {
		return "Floor " + this.currentFloor + ":" + totalPassengers + " passenger";
	    }
	else
	    {
		return "Floor " + this.currentFloor + ":" + totalPassengers + " passengers";
	    }
		
    }


}