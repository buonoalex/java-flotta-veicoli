package org.lesson.java.vehicle;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {

    //Attributi
    private final List<Vehicle> vehicleList;

    //Costruttori
    public FleetManager(){
        this.vehicleList = new ArrayList<>();
    }

    //Getter and Setter
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    //Metodi
    public void AddVehicle(Vehicle vehicle)throws RuntimeException{
        if (IsDuplicate(vehicle)){
            throw new RuntimeException("Il valore è gia stato inserito!");
        }
        this.vehicleList.add(vehicle);
    }

    public boolean FindVehiclewithPlat(int plateToFind){
        boolean find = false;
        for (Vehicle element : vehicleList){
            if(plateToFind == element.getPlate()){
                find = true;
            }
        }
        return find;
    }

    //Bonus
    public boolean IsDuplicate(Vehicle vehicle){
        boolean duplicate = false;
        for (Vehicle element : vehicleList){
            if (element.getPlate() == vehicle.getPlate()){
                duplicate = true;
            }
        }
        return duplicate;
    }

}
