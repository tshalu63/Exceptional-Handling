package exceptionalHandling;

public class CatchOrder {
     public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
