import java.util.Scanner;

public class Assignment_operators {
    public static void main(String[] args){
        //Taking input from user:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int num2 = scanner.nextInt();

        //Calculator:
        System.out.print("Addition of "+num1+" and "+num2+" = ");
        System.out.println(num1 + num2);

        System.out.print("Subtraction = ");
        System.out.println(num1 - num2);

        System.out.print("Multiplication = ");
        System.out.println(num1 * num2);

        System.out.print("Division = ");
        System.out.println(num1 / num2);

        System.out.print("Modulus = ");
        System.out.println(num1 % num2);

        //Increment:
        System.out.print("Increment of "+num1+" with 2 = ");
        System.out.println(num1+=2);
        System.out.print("Increment of "+num2+" with 2 = ");
        System.out.println(num2+=2);

        //Decrement:
        System.out.print("Decrement of "+num1+" by 2 = ");
        System.out.println(num1-=2);
        System.out.print("Decrement of "+num2+" by 2 = ");
        System.out.println(num2-=2);

        //Multiply with the same number:
        System.out.print("Multiplication of "+num1+" with 2 = ");
        System.out.println(num1*=2);
        System.out.print("Multiplication of "+num2+" with 2 = ");
        System.out.println(num2*=2);

        //Division with the same number:
        System.out.print("Division of "+num1+" by 2 = ");
        System.out.println(num1/=2);
        System.out.print("Division of "+num2+" by 2 = ");
        System.out.println(num2/=2);

        //Post and Pre-increment:
        System.out.println("Value of num1 = "+num1);
        System.out.print("Post-incremented Result = ");
        int result = num1++; //it will fetch the value first and then increment. Hence, the result will be same.
        System.out.println(result);

        System.out.println("Value of num1 = "+num1);
        System.out.print("Pre-incremented Result = ");
        int result2 = ++num1;
        System.out.println(result2);
    }
}
