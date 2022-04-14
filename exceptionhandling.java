public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int x = 10, y = 5, z;
            z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            // TODO: handle
            System.out.println("divide by zero not possible"); // exception
        }

    }
}
