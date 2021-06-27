package replit;

public class ParkingMeter {
    int timeLeft;
    int maxTime;
    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }
    public void add(int value){
        boolean leftValue;
        if(value==25 && timeLeft <=maxTime){
            timeLeft += 30;
           leftValue= true;
        }else{
            leftValue=false;
        }

    }
    public void tick(){
        if(timeLeft>0){
            timeLeft--;
        }
    }
    public boolean isExpired(){
        boolean leftValue;
        if(timeLeft==0){
            leftValue= true;
        }else{
            leftValue=false;
        }
        return leftValue;
    }
    public static void main(String[] args) {
        ParkingMeter parkingMeter= new ParkingMeter(29);
        parkingMeter.add(25);
        parkingMeter.tick();
        System.out.println(parkingMeter.timeLeft);
        System.out.println(parkingMeter.isExpired());

    }
}


