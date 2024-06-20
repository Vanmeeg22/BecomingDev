import java.util.Scanner;

public class Enhanced_for_loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for your Array: ");
        int row = scan.nextInt();
        System.out.print("Enter the number of columns for your Array: ");
        int col = scan.nextInt();

        System.out.println("An Array of "+row+" rows and "+col+" columns are produced with random values as shown below:");

        int nums[][] = new int[row][col];

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                nums[i][j] = (int)(Math.random()*100); //random values
            }
        }

        // Enhanced For Loop:
        for (int n[]: nums){
            for (int m: n){
                System.out.print(m+"    ");
            }
            System.out.println();
        }
    }
}
