/*
Method Overloading:
Multiple methods with the same name but different parameters or number of parameters or type of parameters is called method overloading.
 */

import java.util.Scanner;

class calculator1{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }
}
public class Method_overloading {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter the third value: ");
        int n3 = scanner.nextInt();

        calculator1 calc = new calculator1();

        int result = calc.add(n1, n2, n3);
        System.out.println(result);
    }
}
