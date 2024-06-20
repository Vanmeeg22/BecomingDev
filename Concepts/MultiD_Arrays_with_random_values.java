import java.util.Scanner;

public class MultiD_Arrays_with_random_values {
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

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(nums[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
