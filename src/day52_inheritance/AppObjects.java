package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp= new MobileApp();
        mobileApp.setName( "youtube");
        mobileApp.useTheApp(10);

        Intstagram intstagram= new Intstagram();
        intstagram.setName("instagram");
        intstagram.useTheApp(20);//this only works if we do super.method name

        Discord b22Discord= new Discord();
        b22Discord.setName("b22Discord");
        b22Discord.useTheApp(100);
        b22Discord.download();
b22Discord.setVersion(2.67);
b22Discord.printInfo();

    }
}
