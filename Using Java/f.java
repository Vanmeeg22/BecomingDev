import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String s = scan.nextLine();
        System.out.print("Enter the integer value: ");
        int i = scan.nextInt();
        System.out.print("Enter the double value: ");
        double d = scan.nextDouble();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
