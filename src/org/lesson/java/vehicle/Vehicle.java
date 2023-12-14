package org.lesson.java.vehicle;

import org.lesson.java.utility.UtilityVehicle;

public abstract class Vehicle {
    //Attributi
    private static long plate;
    private static int yearOfRegistration;

    //Costruttori
    public Vehicle(){
        plate = UtilityVehicle.RandomPlate();
        yearOfRegistration = UtilityVehicle.RandomYearOfRegistartion();
    }

    //Getter and Setter


    //Metodi


    @Override
    public String toString() {
        return "Vehicle"+"\n"+
                "Plate = "+plate+"\n"+
                "Year of Registration = "+yearOfRegistration+"\n";
    }
}
