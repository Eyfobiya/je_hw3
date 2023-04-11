package task_6;

public class Print2 extends Printer {
    @Override
    void print(String value) {
        System.out.println("\n" + (char) 27 + "[36m" + value + (char)27 + "[0m");
    }
}
