package day58_polymorphis.amazon;

public class Amazon extends OnlineShop implements Prime {
    @Override
    public void buy() {
        System.out.println("buying on amazon");
    }

    @Override
    public void sall() {
        System.out.println("saling on amazon");
    }

    @Override
    public void ship() {
        System.out.println("shipping from amazon");
    }

    @Override
    public void perimeShipping() {
        System.out.println("shipping using prime");
    }
}
