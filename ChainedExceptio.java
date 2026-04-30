package exceptionalHandling;

public class ChainedExceptio {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            Exception ex = new Exception("Custom Exception", e);
            System.out.println(ex.getCause());
        }
    }
}
