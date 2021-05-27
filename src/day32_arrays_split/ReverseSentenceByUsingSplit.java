package day32_arrays_split;

public class ReverseSentenceByUsingSplit {
    public static void main(String[] args) {
        String sentence= "java is fun";
        String sentenceSplit [] =sentence.split(" ");
        String reversed = "";
        for (int i =sentenceSplit.length-1; i>= 0; i--){
            //start with last index till we get 0 index
            System.out.print(sentenceSplit[i]+" ");//use the index split and give me the index value
            reversed+= sentenceSplit[i]+" ";

        }
        System.out.println("\nanother way to print resvese is to reassign reversed ");
        System.out.println(reversed);
    }
}
