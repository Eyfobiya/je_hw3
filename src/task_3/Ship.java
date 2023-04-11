package task_3;
// Для класу Ship – кількість пасажирів та порт приписки.

public class Ship extends Vehicle {
    String destinationPort = "Ukraine";
    int shipPassengers = 303;
    Ship(){
        super(55.999, 50.0, 2021, 880453, 772983);
        System.out.println("\nShip: price = " + price + ", speed = " + speed + ", year = " +
                year + ", coordinatesX = " + coordinatesX + ", coordinatesY = " + coordinatesY);
        System.out.println("Ship: destination port = " + destinationPort + ", number of passengers = " + shipPassengers);
    }
}
