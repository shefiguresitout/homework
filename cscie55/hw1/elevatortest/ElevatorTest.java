package cscie55.hw1.elevatortest;
/**
 * Create an elevator object
 * Board two passengers for floor 3
 * Board one passenger for floor 5
 * Move from ground to top floor
 * Move from top to ground floor
 * Print elevator state before first move
 * Print elevator state after each move
 */

import cscie55.hw1.elevator.Elevator;
public class ElevatorTest {
   public static void main(String[] args) {
       Elevator myElevator = new Elevator();
       myElevator.boardPassenger(3);
       myElevator.boardPassenger(3);
       myElevator.boardPassenger(5);
       
       int numberOfFloorsToVisit=13;
       for (int i = 0; i < numberOfFloorsToVisit; i++)
       {
	   myElevator.move();
       }
       
   }

}
 

