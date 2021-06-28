package com.techelevator;

public class Elevator {

    private boolean openDoor;
    private int numberOfFloors;
    private int currentFloor;

    public Elevator (int totalNumberOfFloors) {
        this.numberOfFloors = totalNumberOfFloors;
        currentFloor = 1;
    }

    public boolean isDoorOpen() {
        return openDoor;

    }
     public int getNumberOfFloors() {
        return numberOfFloors;
     }

     public int getCurrentFloor() {
        return currentFloor;
     }

     public void openDoor() {
        openDoor = true;
     }

     public void closeDoor() {
        openDoor = false;
     }

     public void goUp (int desiredFloor) {
         if (!openDoor && desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
             currentFloor = desiredFloor;
         }
     }

        public void goDown (int desiredFloor) {
            if (!openDoor && desiredFloor >= 1 && desiredFloor < currentFloor) {
                currentFloor = desiredFloor;
            }
         }
     }

