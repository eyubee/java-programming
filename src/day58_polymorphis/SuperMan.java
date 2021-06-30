package day58_polymorphis;

public class SuperMan extends Father implements Worker {

    @Override
    public void work(String job) {

    }

    @Override
    public double getPaid() {
        return 8000;
    }
}
