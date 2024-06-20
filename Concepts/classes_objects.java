import java.util.Scanner;

class calculator{
    int add(int n1, int n2){
        return n1+n2;
    }

    int sub(int n1, int n2){
        return n1-n2;
    }

    int mul(int n1, int n2){
        return n1*n2;
    }

    int div(int n1, int n2){
        return n1/n2;
    }

    int mod(int n1, int n2){
        return n1%n2;
    }
}

public class classes_objects {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int v1 = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int v2 = scanner.nextInt();

        calculator calc = new calculator();

        int addition = calc.add(v1, v2);
        int subtraction = calc.sub(v1, v2);
        int multiplication = calc.mul(v1, v2);
        int division = calc.div(v1, v2);
        int modulus = calc.mod(v1, v2);

        System.out.println("Addition of "+v1+" and "+v2+" = "+addition);
        System.out.println("Subtraction of "+v1+" and "+v2+" = "+subtraction);
        System.out.println("Multiplication of "+v1+" and "+v2+" = "+multiplication);
        System.out.println("Division of "+v1+" and "+v2+" = "+division);
        System.out.println("Modulus of "+v1+" and "+v2+" = "+modulus);
    }
}