package day16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 1;
        if (floorNum == 1) {
            System.out.println("floor 1 selected.Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        }

        System.out.println("========switch statement verstion");
        floorNum = 1;
        switch (floorNum) {
            case 1: //check what floor number it is
                System.out.println("floor 1 selected.Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("invalid selection");
        }
    }
}
