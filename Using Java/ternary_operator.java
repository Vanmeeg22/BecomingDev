import java.util.Scanner;

public class ternary_operator {
    public static void main(String []args){
        //taking input from user:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int num2 = scanner.nextInt();

        String Result = num1>num2 ? num1+" is greater than "+num2 : num1+" is smaller than "+num2;
        System.out.println(Result);
    }
}