package replit;

public class SquareMetrix {
    public static void main(String[] args) {

        int[][] matrix= {{1,2,3}, {4, 5, 6}, {9, 8, 9}};
        int result = 0;

        int leftToRight= 0;
        int RightToLeft= 0;
        for (int i=0; i< matrix.length; i++){
            for (int j= 0; j<matrix.length;j++){
                if(i==j){

                    leftToRight+=matrix[i][j];
                }
            }
        }
        for (int i=0; i<matrix.length; i++){
            int raw= i;
            for (int j= 0; j<matrix.length;j++){
                if(i==raw-j){
                    RightToLeft+=matrix[i][j];
                }
            }
        }


        result=leftToRight-RightToLeft;
        System.out.println(RightToLeft);


        // FINAL PRINT
        // System.out.println(Math.abs(result));
    }

}
