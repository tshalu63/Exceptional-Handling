package exceptionalHandling;

public class FinallyNotRu {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            System.exit(0); // JVM stops
        } finally {
            System.out.println("Finally block"); // won't execute
        }
    }
}
