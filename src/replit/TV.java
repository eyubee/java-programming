package replit;

public class TV {
    private int channel=1;
    private int volumeLevel=0;
    private boolean on= false;
    private String brand ="undefined";

    public void setVolumeLevel(int volumeLevel ){
        this.volumeLevel= volumeLevel;
    }
    public int getVolumeLevel(){
        return volumeLevel;
    }
    public void  setChannel(int channel){
        this.channel= channel;
    }
    public int getChannel(){
        if(channel<=0){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
        return channel;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public int channelUp(int channel){
        this.channel= channel;
        return channel +1;
    }

    public int volumeDown(int volumeLevel){
        this.channel= volumeLevel;
        if(volumeLevel< 0 && volumeLevel >7 ){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
        return volumeLevel;
    }
    public int volumeUp(int volumeLevel){
        this.channel= volumeLevel;
        if(volumeLevel< 0 && volumeLevel >7 ){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
        return volumeLevel;
    }
    public boolean isOn( boolean on){
        this.on= on;
        if(on==true){
            return on;
        }
        return on;
    }
    public String turnOn(){
        this.on= on;
        if(on==true){
            return "TV is already ON";
        }
        return "TV is already OFF";
    }
    public String turnOff(){
        this.on= on;
        if(on == false){
            return "TV is already OFF";
        }
        return "TV is already ON";
    }
    public TV(){
        System.out.println("Creating TV object using no args-constructor");
    }
    public TV(String brand){
        this.brand= brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }
}
