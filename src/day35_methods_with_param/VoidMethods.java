package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        System.out.println("-------Flag of USA--------");
        displayUsFlag();

    }
    /** print A to Z*/
    public static void printAtoZ(){
        for(char i= 'A';i<='Z'; i++ ){
            System.out.print(i+" ");
        }
        }
        public static void displayUsFlag() {
            String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
            String p2 = "==============================================";
            for (int i = 0; i < 4; i++) {
                System.out.println(p1);
                System.out.println("* * * * * * ==================================");
                for (int j = 0; j < 6; j++) {
                    System.out.println(p2);
            }
        }

    }
}
