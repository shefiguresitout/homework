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

    public Elevator()
    {
	this.currentFloor=1;
	this.travelDirection=1;
	this.passengersForFloor = new int[totalFloors];
    }

    public void move()
    {
	/**  Print out current settings
	 */
	this.toString();

    	/** If elevator is on top floor, reverse direction
	 */
	if (this.currentFloor==totalFloors) {
	    this.travelDirection=-1;
	}
	
	/** If elevator is on ground floor, reverse direction
	 */
	if (this.currentFloor==groundFloor) {
	    travelDirection=1;
	}

	/** Zero out passengers for current floor
	 *  Move elevator by one floor
	 **/
        this.passengersForFloor[this.currentFloor]=0;
	this.currentFloor += travelDirection;
}
    
    public String toString()
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
