package exceptionalHandling;

public class FinallyReturn {
    static int test() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Finally executed");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
