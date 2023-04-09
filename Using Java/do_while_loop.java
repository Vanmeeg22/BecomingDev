import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args){
        //taking user input:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        System.out.print("Enter the number of times you want to loop "+word+" : ");
        int  i = scanner.nextInt();

        //looping:
        do {
            System.out.println(i+" "+word);
            i--;
        }while (i>=1);
    }
}
