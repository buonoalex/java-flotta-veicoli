package org.lesson.java.vehicle;

import org.lesson.java.utility.UtilityVehicle;

public class Main {
    public static void main(String[] args) {
        FleetManager f1 = new FleetManager();

        try {
            f1.AddVehicle(new Car(2));
            f1.AddVehicle(new Car(4));
            f1.AddVehicle(new Car(4));
            f1.AddVehicle(new Car(4));
            f1.AddVehicle(new Motocycle(true));
            f1.AddVehicle(new Motocycle(false));
            f1.AddVehicle(new Motocycle(false));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        UtilityVehicle.PrintListVehicles(f1.getVehicleList());

        int countCar = UtilityVehicle.CountCar(f1.getVehicleList());
        int countMotocycle = UtilityVehicle.CountMotocycle(f1.getVehicleList());
        System.out.println(countCar + "\n");
        System.out.println(countMotocycle + "\n");

        boolean findPlate = f1.FindVehiclewithPlat(2222222);
        if (findPlate){
            System.out.println("Abbiamo trovato la targa");
        }else {
            System.out.println("Non esiste questa targa");
        }
    }
}
