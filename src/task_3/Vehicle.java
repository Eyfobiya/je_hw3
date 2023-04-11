package task_3;
// Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
// Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
// Для класу Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.

public class Vehicle {
     double price;    // Створити клас Vehicle. У тілі класу створіть поля:
     double speed; // координати та параметри суден (ціна, швидкість, рік випуску).
     int year;
     double coordinatesX;
     double coordinatesY;

    public Vehicle(double price, double speed, int year, double coordinatesX, double coordinatesY) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }
}
