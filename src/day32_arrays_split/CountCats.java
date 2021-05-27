package day32_arrays_split;

public class CountCats {
    public static void main(String[] args) {
        String cats= "bengal cat tabby cat persian cat no cat here ";
        //WITHOUT SPLIT
        int count = 0;
        for (int i= 0; i < cats.length()-2; i++)
        {
            if (cats.substring(i,i+3).equals("cat")){
                count++;
            }
        }
        System.out.println("cat count= "+count);

        ///WITH SPLIT
        String catCount [] = cats.split("cat");
        System.out.println("number of 'cat' = "+(catCount.length-1));
        //to get cat types
       for (String type :catCount ){
           System.out.println(type);
       }
    }
}
