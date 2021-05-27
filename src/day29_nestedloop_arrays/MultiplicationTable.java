package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer= 1; outer<=12; outer++){
            for (int inner =1; inner<=12; inner++){
                System.out.print(outer*inner+"\t");
            }
            System.out.println();
        }
    }
}
