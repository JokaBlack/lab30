package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        List<Car> carSet = new ArrayList<>(Car.carCreator());
        List<Car> parking = new ArrayList<>();
        List<Check> checkList = new ArrayList<>();


        int countDay = 0;
        int countHour = 0;
        int countMinutes = 0;


        while (countDay != 30) {

            if (countHour == 24) {
                countDay += 1;
                countHour = 0;
            }
            if (countMinutes == 60) {
                countHour++;
                countMinutes = 0;
            }

            for (Car c : carSet) {
                int rnd1 = new Random().nextInt(100) + 1;

                if (rnd1 <= 3 && c.getState() != State.IN_THE_PARKING && parking.size() != 20) {
                    c.setState(c.getState().replaceState());
                    c.setStartTime(countHour + ":" + countMinutes);
                    parking.add(c);
                }
            }
            carSet.removeAll(parking);
            for (Car c : parking) {
                int rnd2 = new Random().nextInt(100) + 1;

                if (rnd2 <= 3 && c.getState() == State.IN_THE_PARKING) {
                    if (countHour >= 9 && countHour <= 21) {
                        if (c.getTimeCounter() > 30) {
                            checkList.add(new Check(countDay, c.getStartTime(), countHour + ":" + countMinutes, c.getTimeCounter(), c.getTimeCounter() * 2, c));
                        }
                    }
                    c.setState(c.getState().replaceState());
                    c.setTimeCounter(0);
                    c.setStartTime("");
                    carSet.add(c);
                }

            }

            parking.removeAll(carSet);
            if (countHour >= 9 && countHour <= 21) {
                for (Car c : parking) {
                    c.setTimeCounter(c.getTimeCounter() + 5);

                }


            }


            countMinutes += 5;
        }
        for (Check c:checkList) {
            System.out.println(c);
        }
    }
}