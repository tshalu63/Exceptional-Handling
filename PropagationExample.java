package exceptionalHandling;

public class PropagationExample {
    void method1() {
        int data = 50 / 0; // Exception
    }

    void method2() {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception handled in method3");
        }
    }

    public static void main(String[] args) {
        PropagationExample obj = new PropagationExample();
        obj.method3();
    }
}
