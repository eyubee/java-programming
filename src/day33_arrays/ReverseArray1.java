package day33_arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
        int [] nums= {5,10,4,100};
        int [] numsRev= new int[nums.length];//taking the length of nums and have defult value of 0's

         /** METHOD 1*/
        for (int i=nums.length-1,j=0;i>=0; i--,j++) {
            //i starts at the last index and j starts at the first index so we assign j and make it equal to i which is the last index so the first index becomes the last index
            numsRev[j]= nums[i];
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        /**METHOD 2 */
        for (int i=nums.length-1;i>=0; i--){
            System.out.print(nums[i]+" ");
        }
        /** METHOD using the same Array 3*/

    }
}
