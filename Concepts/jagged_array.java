public class jagged_array {
    public static void main(String[] args){
        //jagged array:

        int nums[][] = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[7];
        nums[2] = new int[3];

        //Manual values:
//        nums[0][0] = 12;
//        nums[0][1] = 32;
//        nums[0][2] = 66;
//        nums[0][3] = 78;
//        nums[1][0] = 13;
//        nums[1][1] = 99;
//        nums[1][2] = 95;
//        nums[1][3] = 34;
//        nums[1][4] = 65;
//        nums[1][5] = 11;
//        nums[1][6] = 58;
//        nums[2][0] = 95;
//        nums[2][1] = 10;
//        nums[2][2] = 19;

        //Random Values:
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*100);
            }
        }

//        for (int i=0; i<nums.length; i++){
//            for (int j=0; j<nums[i].length; j++){
//                System.out.print(nums[i][j]+"   ");
//            }
//            System.out.println();
//        }

        // Enhanced For loop:
        for (int n[]: nums){
            for (int m: n){
                System.out.print(m+"   ");
            }
            System.out.println();
        }
    }
}
