package day33_arrays;

public class MuiltDemInteArray {
    public static void main(String[] args) {
        int[][] numssD = {
                {12, 55, 4, 7},    //0
                {123, 555, 9},       //1
                {56, 87, 455, 34},   //2
                {234, 12, 54, 23, 23}//3
        };
        int sum=0;
        for (int i = 0; i < numssD.length; i++) {
            for (int j=0; j<numssD[i].length;j++){
                if(j==j){
                    sum+=numssD[i][j+1];
                }
                System.out.println(numssD[i][j]);

            }

        }
    }
}