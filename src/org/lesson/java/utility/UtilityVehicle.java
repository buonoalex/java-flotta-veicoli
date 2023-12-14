package org.lesson.java.utility;

import java.util.Random;

public class UtilityVehicle {
    //Metodi
    public static long RandomPlate(){
        Random number = new Random();
        return number.nextLong(0000000,9000000);
    }

    public static int RandomYearOfRegistartion(){
        Random number = new Random();
        return number.nextInt(1900,2024);
    }
}
