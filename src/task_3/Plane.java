package task_3;
// Для класу Plane має бути визначена висота та кількість пасажирів.

public class Plane extends Vehicle {
    double planeHeight = 2.68;
    int planePassengers = 10;
    Plane(){
        super(100.999, 864.5, 2022, 2121, 6565);
        System.out.println("\nPlane: price = " + price + ", speed = " + speed + ", year = " +
                year + ", coordinatesX = " + coordinatesX + ", coordinatesY = " + coordinatesY);
        System.out.println("Plane: height = " + planeHeight + ", number of passengers = " + planePassengers);
    }
}
