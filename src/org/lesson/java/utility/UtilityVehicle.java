package org.lesson.java.utility;

import org.lesson.java.vehicle.Car;
import org.lesson.java.vehicle.Motocycle;
import org.lesson.java.vehicle.Vehicle;

import java.util.List;
import java.util.Random;

public class UtilityVehicle{
    //Metodi
    public static long RandomPlate(){
        Random number = new Random();
        return number.nextLong(0000000,9000000);
    }

    public static int RandomYearOfRegistartion(){
        Random number = new Random();
        return number.nextInt(1900,2024);
    }

    public static void PrintListVehicles(List<Vehicle> vehicleList){
        for (Vehicle element : vehicleList){
            System.out.println(element.toString());
        }
    }

    public static int CountCar(List<Vehicle> vehicleList){
        int countCarFinal = 0;
        for (Vehicle element : vehicleList){
            if (element instanceof Car){
                countCarFinal += 1;
            }
        }
        return countCarFinal;
    }

    public static int CountMotocycle(List<Vehicle> vehicleList){
        int countMotocycleFinal = 0;
        for (Vehicle element : vehicleList){
            if (element instanceof Motocycle){
                countMotocycleFinal += 1;
            }
        }
        return countMotocycleFinal;
    }

}
