This zip file is comprised of:
README.txt
__elevator.jar
__zoo.jar
the doc directory

__elevator.jar contains the files necessary to run the elevator simulation.
To run the elevator simulation, issue the command:
java -cp __elevator.jar cscie55.hw1.elevatortest.ElevatorTest

__zoo.jar contains animal classes for the zoo assignment.  According to the assignment, 
the classes were supposed to be in csci55.zoo.animals so that's where I put them, rather 
than putting them under the hw1 directory.

The doc directory was generated with this command:
javadoc -d doc -html5 cscie55.hw1.elevator cscie55.hw1.elevatortest
