import java.util.Scanner;

public class Multidimensional_Arrays {
    public static void main(String[] args){
        int nums[][] = new int[2][4];
        nums[0][0] = 20;
        nums[0][1] = 16;
        nums[0][2] = 9;
        nums[0][3] = 110;
        nums[1][0] = 106;
        nums[1][1] = 65;
        nums[1][2] = 50;
        nums[1][3] = 4;

        for (int i=0; i<=1; i++){
            for (int j=0; j<=3; j++){
                System.out.print(nums[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
