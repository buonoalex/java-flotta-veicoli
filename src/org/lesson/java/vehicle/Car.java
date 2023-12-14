package org.lesson.java.vehicle;

public class Car extends Vehicle{
    //Attributi
    private int doorOfCar;

    //Costruttori
    public Car(int doorOfCarUser){
        super();
        doorOfCar = doorOfCarUser;
    }

    //Getter and Setter
    public int getDoorOfCar() {
        return doorOfCar;
    }

    //Metodi
    @Override
    public String toString() {
        return super.toString()+"Type = Car"+"\n"
                +"door of the car = "+doorOfCar+"\n"
                +"--------------- \n";
    }
}
