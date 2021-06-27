package day52_inheritance;

public class Discord extends  MobileApp{
    public void chat(String someone){
        System.out.println("Chattng with "+someone+" on discord");

    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("bob");
    }
    @Override
    public boolean download(){
        System.out.println("Downloaded version 1.8 of discord");
        return true;
    }
    public void printInfo(){
        System.out.println("app name " +getName());
        System.out.println("app version " + getVersion());
    }
    public class ChangeDataType extends MobileApp{

    }

}
