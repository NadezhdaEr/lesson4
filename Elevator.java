package com.company.type;

public class Elevator {

    int MAXFLOOR;

    int currentFloor;


    public transfer(int nextFloor) {
        if (nextFloor<0 || nextFloor>MAXFLOOR) return;
        currentFloor = nextFloor;
    }

    public String toString(){
        return"Текущий этаж:" +currentFloor;
    }
}
