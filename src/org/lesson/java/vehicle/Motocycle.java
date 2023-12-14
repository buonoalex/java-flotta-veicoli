package org.lesson.java.vehicle;

public class Motocycle extends Vehicle{
    //Attributi
    private boolean motocycleStand;

    //Costruttori
    public Motocycle(boolean motocycleStandUser){
        super();
        motocycleStand = motocycleStandUser;
    }

    //Getter and Setter
    public boolean isMotocycleStand() {
        return motocycleStand;
    }

    //Metodi

    @Override
    public String toString() {
        return super.toString()+"Type = Motocycle"+"\n"+
                "Motocycle stand = "+ motocycleStand+"\n"+
                "--------------------- \n";
    }
}
