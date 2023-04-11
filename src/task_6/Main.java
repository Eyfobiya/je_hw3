package task_6;

public class Main {
    public static void main(String[] args) {
        Print2 print2 = new Print2();
        Printer print2Up = print2;
        print2Up.print("subclass Print2: blue color");

        Print3 print3 = new Print3();
        Printer print3Up = print3;
        print3Up.print("subclass Print2: yellow color");

        Printer printer = new Printer();
        printer.print("superclass Printer: standard color");
    }
}
