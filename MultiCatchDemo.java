package exceptionalHandling;

public class MultiCatchDemo {
     public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            int result = arr[5] / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled multiple exceptions: " + e);
        }
    }
}
