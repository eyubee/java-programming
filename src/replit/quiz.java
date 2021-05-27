package replit;

public class quiz {
    public static void main(String[] args) {
        int x= 10;
        int y = x++;
        System.out.println(y+++"" +x+++"" + y);
        boolean h= true;
        boolean g= !h ==false;
        boolean z=g;
        if (h){
            System.out.println("hello everyone");}
        if (g){
            System.out.println("nfasdb ");
    }
    if(z){
        System.out.println("memem");
    }
    int score =0;
    if (score ==0){
        score +=50;
    }
    if (score !=0){
      score +=50;
        System.out.println(score);}
    int num1 =9;
    if (num1++ ==10){
        System.out.println(num1);
    }else{
        System.out.println("nothing"+num1);
    }
    boolean a= true;
    boolean b= ! false;
    if (b){
        System.out.println("b");
    }else{

        System.out.println("a");
    }

}
}