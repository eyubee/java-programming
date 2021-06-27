package day55_abstraction.exercis_example;

public class Running extends Exercise {
    @Override
    public void perform() {
        System.out.println("performing running in exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {

        return minutes *13;
    }
}
