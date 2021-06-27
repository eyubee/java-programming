package replit;

public class TV {
    private int channel=1;
    private static int volumeLevel=0;
    private boolean on= false;
    private String brand ="undefined";

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void  setVolumeLevel(int volumeLevel ){
        if((volumeLevel > 0 && volumeLevel <7 )&& (isOn())){

            this.volumeLevel= volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public static int getVolumeLevel(){
        return volumeLevel;
    }

    public void  setChannel(int channel){

        if(channel<=0 || channel > 120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else {
            this.channel= channel;
        }
    }
    public int getChannel(){
        return channel;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void  channelUp(){
        channel++ ;
    }
    public void channelDown(){

   channel--;
    }

    public void volumeDown(){
        if(volumeLevel< 0 && volumeLevel >7 ){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else {
            volumeLevel--;
        }
    }

    public  void volumeUp(){
        if(volumeLevel< 0 && volumeLevel >7 ){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else{
            volumeLevel++;
        }

    }
    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        if(on==true){
            System.out.println("TV is already ON");
        }else {
            System.out.println("TV is already OFF");
        }
    }
    public void turnOff(){
        if(on == false){
            System.out.println("TV is already OFF");
        } else {
            System.out.println("TV is already ON");
        }

    }
    public TV(){
        System.out.println("Creating TV object using no args-constructor");
    }
    public TV(String brand){
        this.brand= brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }
}


