package exceptionalHandling;

public class RethrowExample {
     static void check() {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Handling here, then rethrow");
            throw e; // rethrow
        }
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            System.out.println("Handled again in main");
        }
    }
}
