package task_3;

import java.util.Scanner;

public class Car extends Vehicle{
    Car(){
        super(22.999, 164.5, 2023, 4444, 7878);
        System.out.println("Car: price = " + price + ", speed = " + speed + ", year = " +
                year + ", coordinatesX = " + coordinatesX + ", coordinatesY = " + coordinatesY);
    }
}
