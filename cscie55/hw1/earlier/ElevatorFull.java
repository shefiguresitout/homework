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
    private int[] passengersForFloor[totalFloors];

    /* define instance methods */    
    public void move() {
	/** If elevator is on top floor, reverse direction
	 */
	if (this.floor==totalFloors) {
	    this.travelDirection=-1;
	}
	
	/** If elevator is on ground floor, reverse direction
	 */
	if (this.floor==groundFloor) {
	    travelDirection=1;
	}
	/** Zero out passengers for current floor
	 *  Move elevator by one floor
	 *  Print out current settings
	 **/
        this.passengersForFloor[this.floor]=0;
	this.floor += travelDirection;
	this.toString();
	}
					
					}
    
    public void boardPassenger(int destinationFloor) {
	this.passengersForFloor[this.(destinationFloor-1)]+=1;
    }
    
    public array? toString() {
	passengersOnBoard=0
	    this.floor /* current floor */
	    passengersOnBoard+=this.passengersForFloor[i]
	           printf ("Floor ", %d, ": ,"%d, " Passenger"'"s",%n);

	    }
    
    
}
