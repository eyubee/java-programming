package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word= "gitgub";
        char letter= 'k';
        int index= -1;// we are doing -1 because 0 is a valid value
        for (int i=0;i<word.length();i++){
            //if hcarat(i) matches letter store the i value into index
           //System.out.println(i+"-"+word.charAt(i));
            if (word.charAt(i)==letter){
                index=i;
                System.out.println(letter+" is found at index "+index);
                break;// exit for loop
                /**return;//stop the program right after the loop/ and main mathod */
            }

            }
        if(index==-1) {
            System.out.println("index not found");
        }
        }

    }

