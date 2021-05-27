package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'g';
        boolean answer;
        String result;
        int deletedFiles;
        if (selection=='Y') {
            System.out.println("Your file will be deleted");
            answer=true;
            result="deleted";//aassigning value in the if condition
            deletedFiles=1;
        }
        else {
            System.out.println("File deletion canncelled");}
            answer=false;
            result="keep";
            deletedFiles=0;
        System.out.println("Did file get deleted? "+answer+"\n"+result+deletedFiles);
    }
}


