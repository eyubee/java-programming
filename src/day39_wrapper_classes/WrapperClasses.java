package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=100;
        Integer n= new Integer(500);
        System.out.println(n.equals(500));
        Integer intObject=1000;
        String numStr= intObject+"";
        //OR can do
        numStr=intObject.toString();
        System.out.println("num String = "+numStr);
        Byte b1= new Byte((byte)5 ) ;
        Byte b2= 10;
        Short sh1= new Short((short)40);
        Integer i1= new Integer(100);
        Integer i2= 200;
        Long l1= new Long (300L);
        Long l2= 3455L;
        Float fl1= new Float (5.2F);
        Float fl2= 45.3F;
        Double d1 = new Double (345.3);
        Double d2= 234.5;
        Character  ch1= new Character('q');
        Character cha2= 'q';
        Boolean bo1= false;

    }
}
