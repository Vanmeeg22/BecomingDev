public class ThreeD_Array {
    public static void main(String[] args){
        //3D Array:
        int nums[][][] = new int[3][4][5];

        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                for (int k=0; k<5; k++){
                    nums[i][j][k] = (int)(Math.random()*100);
                }
            }
        }

//        for (int i=0; i<3; i++){
//            for (int j=0; j<4; j++){
//                for (int k=0; k<5; k++){
//                    System.out.print(nums[i][j][k]+"    ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        // Enhanced For loop:
        for (int n[][]: nums){
            for (int m[]: n){
                for (int k: m){
                    System.out.print(k+"    ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
