package day55_abstraction.exercis_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running(); //polymorphism
        Running running = new Running();
        Swimming swimming= new Swimming();
        FreeWeight freeWeight= new FreeWeight();
        exercise.start();
        exercise.perform();
        System.out.println("worked out for 30 mints- calories =  "+freeWeight.getCaloriesCount(20));


    }
}
