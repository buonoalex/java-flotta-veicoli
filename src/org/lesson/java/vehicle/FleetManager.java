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
    public void AddVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    public Boolean FindVehiclewithPlat(int plateToFind){
        Boolean find = false;
        for (Vehicle element : vehicleList){
            if(plateToFind == element.getPlate()){
                find = true;
            }
        }
        return find;
    }
}
