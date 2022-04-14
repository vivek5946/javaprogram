import java.util.Scanner;

//package.abu.packageconcept
public class calculater {
    public int addition(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        calculater c1 = new calculater();
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("enter number");
        n1 = input.nextInt();
        System.out.println("enter number 2");
        n2 = input.nextInt();
        int result = c1.addition(n1, n2);
        System.out.println(result);

    }
}
