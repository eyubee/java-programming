package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        //if slesction is 1 say "hello, thanks for the call" if 2 "hola....."
        int selecation = 3;
        System.out.println("choose your language");
        if (selecation == 1) {
            System.out.println("Hello, thanks for calling");
        } else if (selecation == 2) {
            System.out.println("Hola......");
        } else if (selecation == 3) {
            System.out.println("blalabla....");
        } else {
            System.out.println("lets talk java");
        }
    }

}
