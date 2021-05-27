package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[]args)
    {
        // title,company,jobDescription, salary, yearsExp, hasBenefits
        String title ="Jave Developer";
        String company= "Google";
        String jobDiscription= " work with project development and designing new programs and apps";
        double salary=12000.00;
        byte yearsExp =6;
        boolean hasBenefits=true;
        System.out.print("I am a "+title+" for "+company+" and I"+jobDiscription+" and my is"+salary+
                "I have "+yearsExp+"."+"Does come with benefits? "+hasBenefits);
    }
}
