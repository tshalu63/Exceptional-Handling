package exceptionalHandling;

public class StackTraceDemo {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace(); // prints full error
        }
    }
}
