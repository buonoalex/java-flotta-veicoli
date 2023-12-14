package org.lesson.java.vehicle;

import org.lesson.java.utility.UtilityVehicle;

import java.util.Objects;

public abstract class Vehicle {
    //Attributi
    private long plate;
    private int yearOfRegistration;

    //Costruttori
    public Vehicle(){
        plate = UtilityVehicle.RandomPlate();
        yearOfRegistration = UtilityVehicle.RandomYearOfRegistartion();
    }

    //Getter and Setter
    public long getPlate() {
        return plate;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    //Metodi
    @Override
    public String toString() {
        return "Vehicle"+"\n"+
                "Plate = "+plate+"\n"+
                "Year of Registration = "+yearOfRegistration+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return plate == vehicle.plate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate);
    }
}
