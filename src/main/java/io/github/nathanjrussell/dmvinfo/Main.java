package io.github.nathanjrussell.dmvinfo;

import io.github.nathanjrussell.dmvinfo.passenger.Makes;
import io.github.nathanjrussell.dmvinfo.passenger.PassengerVehicle;
import io.github.nathanjrussell.dmvinfo.passenger.ford.Models;

public class Main {
    public static void main(String[] args) {
        PassengerVehicle car = new PassengerVehicle("1HGCM82633A123456", 2020, Makes.FORD) {
            @Override
            public String toString() {
                return super.toString() + "    Model: " + Models.MUSTANG;
            }
        };

        System.out.println(car);
    }
}
