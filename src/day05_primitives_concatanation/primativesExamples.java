package day05_primitives_concatanation;

public class primativesExamples {
    public static void main (String[]args)
    {
        // whole numbers/integer types. Long needs L at the end of the #
        byte byteValue = 100;
        short shortValue= 32767;
        int intValue= 235479780;
        long longValue= 5655899873423324467L;

        //decimal numbers/floating point types. float needs F at the end of the #.
        // For Double, adding D at the end is optional
        float floatValue= 923.74988E7F;
        double doubleValue= 2674747.99099;
        //char is a single character in single quotes and it can only take one latter ex: for gender
        char charValue='A';
        //Boolean= ture/false..yes/no
        boolean booleanValue= true;
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);

    }
}
