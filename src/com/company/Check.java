package com.company;

public class Check {
    private int day;
    private String startTime;
    private String finishTime;
    private int minutes;
    private double toPay;
    private Car car;

    public Check(int day, String startTime, String finishTime, int minutes, double toPay, Car car) {
        this.day = day;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.minutes = minutes;
        this.toPay = toPay;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getToPay() {
        return toPay;
    }

    public void setToPay(double toPay) {
        this.toPay = toPay;
    }

    @Override
    public String toString() {
        return "Check{" +
                "day=" + day +
                ", startTime='" + startTime + '\'' +
                ", finishTime='" + finishTime + '\'' +
                ", minutes=" + minutes +
                ", toPay=" + toPay +
                ", car=" + car +
                '}';
    }
}
