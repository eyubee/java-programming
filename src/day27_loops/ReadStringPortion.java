package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,cat,red_car,java,selenium";
       // System.out.println(list.substring(0,3)+list.substring(list.indexOf(",")+1,list.indexOf(",")));
        int j=0;
        //System.out.println(list.substring(j,j+3));
        for (int i= 0; i<list.length()-2; i++){//-2 becuase we are looking for 3 charaters
           // System.out.println(list.substring(i, i+3));
            if (list.substring(i, i+3).equals("car")|| list.substring(i, i+3).equals("cat")){
                System.out.println(list.substring(i, i+3));}
            //other way
            String part= list.substring(i,i+3);
            if (part.equals("car")|| part.equals("cat"))   {
                System.out.println(part);
            }

        }
    }
}
