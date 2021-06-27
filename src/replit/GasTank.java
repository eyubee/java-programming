package replit;

public class GasTank {
    double amount=0.0;
    double capacity;
    public GasTank(double capacity){
        this.capacity=capacity;
    }

    public void addGas(double value){
        amount +=value;
        if(amount > capacity){
            amount=capacity;
        }
    }
    public void useGas(double gasValue){
        amount -= gasValue;
        if(amount < 0){
            amount=0;
        }

    }
    public boolean isEmpty(){

        return amount < 0.1;
    }

public boolean isFull(){

        return amount > (capacity- 0.1) ;
}
public double getGasLevel(){
        return amount;
}
public double fillUp(){
    double difference= capacity-amount;
    amount=capacity;
        return  difference;
}

    public static void main(String[] args) {
        GasTank gasTank= new GasTank(20);
        gasTank.addGas(5);
        System.out.println(gasTank.isFull());
        gasTank.useGas(20);
        System.out.println(gasTank.isEmpty());
        gasTank.fillUp();
        System.out.println(gasTank.getGasLevel());

    }
}
