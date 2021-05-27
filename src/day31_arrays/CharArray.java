package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char letters [] = {'j','a','v','a',' ','i','s',' ','f','u','n'};
        for (char lettPrint: letters ){
            System.out.print(lettPrint+"");//printing each latter

        }
        String sentence= new String (letters);

        System.out.println("\nsentence= "+sentence);
        String item= "wooden spoon";
        char [] iteamArray = item.toCharArray();
        System.out.println(iteamArray.length);
        String [] fruits= {"bananas","apples","kiwi", "mango","papaya","strawberry"};
        String fruitsStr="";
        for( String each:fruits){
            fruitsStr +=each+ "-";
            System.out.print(each+"-");
        }
        System.out.println("\nfruitStr= "+fruitsStr);
        String [] languages= {"java","phython", "c++","ruby", "sql","javascript "};
        String.join("|",languages);
        System.out.print(String.join("|",languages));
    }
}
