package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start watching cat video");
        int seconds=0;
        while (seconds <=117){
            System.out.println("Wathing \uD83D\uDC15 at second: "+seconds);
            seconds++;
            Thread.sleep(1000);//wait 1 sec before moving the next second

        }
        System.out.println("finished watching \uD83D\uDC08 video, lets start a new one");

    }
}
