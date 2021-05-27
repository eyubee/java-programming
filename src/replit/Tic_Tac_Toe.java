package replit;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }



    public static String won(char[] x){
        String winner= "";
//v for vertical
//h for horizontal
        for(int h= 0, v=0;  v < x.length; h++,v+=3){
            String rows= ""+x[v] + x[v+1 ]+ x[v+2];//vertical
            String coulmes=""+ x[h]+x[h+3]+x[h+6];//horizontal
            String diagonal = "";
            if(h==0){
                diagonal= ""+ x[h]+ x[h+4] + x[h+8];
            }else if(h==1){
                diagonal= ""+ x[h]+ x[h+2] + x[h+6];
            }else if(x[h]=='O' && x[h+4]=='O' && x[h+7]=='O'){
                winner= "Player 0 won";
            }
            if(rows.equalsIgnoreCase("xxx")|| coulmes.equalsIgnoreCase("xxx")|| diagonal.equalsIgnoreCase("xxx")){
                winner="Player X won";
            }else if(rows.equalsIgnoreCase("ooo")|| coulmes.equalsIgnoreCase("ooo") || diagonal.equalsIgnoreCase("ooo")){
                winner= "Player 0 won";
            }

        }


        return winner;

    }

}
