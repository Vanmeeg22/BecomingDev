import java.util.Arrays;

public class Arrays_file {
    public static void main(String[] args){

        //Array 1:
        int num[] = {23,54,12,23,15,11};
        System.out.println(num[0]); //23
        //Update the 2nd value:
        System.out.println(num[1]); //54
        num[1] = 26;
        System.out.println(num[1]); //26

        System.out.println("****************************************************************************");

        //Array 2:
        int num1[] = new int[4];
        num1[0] = 16;
        num1[1] = 103;
        num1[2] = 112;
        num1[3] = 156;

        for(int i=0; i<=3; i++){
            System.out.println(num1[i]);
        }
    }
}
