package com.company;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Car {
private int number;
private State state = State.IN_DRIVE;
private int timeCounter;
private String startTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getTimeCounter() {
        return timeCounter;
    }

    public void setTimeCounter(int timeCounter) {
        this.timeCounter = timeCounter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }



    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", state=" + state +
                ", timeCounter=" + timeCounter +
                '}';
    }

    public static Set<Car> carCreator(){
        Set<Car> carSet = new HashSet<>();
        while (carSet.size() != 200){
            Car car = new Car();
            int rndNum = new Random().nextInt(888)+111;
            car.setNumber(rndNum);
            carSet.add(car);
        }
        return carSet;
    }
}
