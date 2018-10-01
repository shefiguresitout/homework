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

    public void boardPassenger(int destinationFloor) {
	this.passengersForFloor[destinationFloor - 1] += 1;
    }
    
    public void move()
    {
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
	 *  Print out current settings
	 */
	
        this.passengersForFloor[this.currentFloor -1]=0;
        System.out.println(this.toString());
	this.currentFloor += travelDirection; 
}

    public String toString()
    {
	totalPassengers = 0;
	for (int i=(groundFloor-1); i < totalFloors; i++) {
	totalPassengers += this.passengersForFloor[i];
	}
	int floor=this.currentFloor - 1;
	if (totalPassengers == 1)
	    {
		return "Floor " + (this.currentFloor) + ":" + totalPassengers + " passenger";
	    }
	else
	    {
		return "Floor " + (this.currentFloor) + ":" + totalPassengers + " passengers";
	    }
		
    }


}
