package day26_loops_more;

public class CountMattaches {
    public static void main(String[] args) {
        String word= "java";
        char letter= 'a';
        int count=0;
        //read each character using a for loop  and test if it matches letter  if true add 1 to count and print the count
        for (int i= 0; i< word.length(); i++){
            if (word.charAt(i)==letter){
                count++;
                System.out.println("there are "+count+" "+letter+"'s in "+word);

            }

        }

    }
}
