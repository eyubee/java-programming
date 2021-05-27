package day30_arrays;



public class StudentArray {
    public static void main(String[] args) {
       /** String [] stud1= new String[5];
        stud1[0]= "123abc";
        stud1[1]="eyerusalem";
        stud1[2]=" tefera";
        stud1[3]= "batch22";
        stud1[4]=111-222-3333;  this is the log way to declaring array
        */
         String [] stud1={"123abc","eyerusalem","tefera","batch22", "111-222-3333"};
        String [] stud2={"123abc","eyerusalem","tefera","batch22"};
        System.out.println("student id "+stud1[0]);
        System.out.println("student first name  "+stud1[1]);
        System.out.println("student last name "+stud1[2]);
        System.out.println("student batch  "+stud1[3]);
        System.out.println("student phone number "+stud1[4]);
        System.out.println("data length: "+stud1.length);
        if (stud1.length==5){
            System.out.println("student data array has correct length");
        }else if (stud1.length!=5){
            System.out.println("data array has inncorrect length ");
        }if (stud1.length==stud2.length){
            System.out.println("data array length match");
        }else if (stud1.length!=stud2.length){
            System.out.println("data array length  doesn't match");
        }
        System.out.println(stud1[1].toUpperCase()+" "+stud1[2].toUpperCase());

    }
}
