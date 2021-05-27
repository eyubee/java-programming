package officeHours_3_16;

public class StrringPractice {
    public static void main(String[] args) {
        String word = "apple";
        String word2 = "banana";
        String wordMiddle = "elephant";
        int wordlength = wordMiddle.length();
        System.out.println("word without first char= " + word.substring(1));
        System.out.println("word without last char= " + word2.substring(0, 5));
        if (wordlength % 2 == 0) {
            System.out.println(wordMiddle.substring(3, 5)); //or
            int index= wordMiddle.length()/2;
            System.out.println(""+wordMiddle.charAt(index-1)+wordMiddle.charAt(index));
        } else {
            System.out.println(wordMiddle.substring(3, 4));
        }
        String firstName = "james";
        String lastName = "bone";
        String Initials = firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase();
        System.out.println(Initials);
        String moveFirstWord = "java is a fun language";
        System.out.println(moveFirstWord.substring(moveFirstWord.indexOf("is")) +
                " " + moveFirstWord.substring(0, moveFirstWord.indexOf("is")));
        String email="<James Bond>. From Number: [202-123-3456]. " +
                "+ Message: {“I love programming and problem solving}";
        System.out.println("Sender: "+email.substring(email.indexOf("<")+1,email.indexOf(">"))+"\nNumber: "
                +email.substring(email.indexOf("[")+1,email.indexOf("]"))+"\nMessage: "+
                email.substring(email.indexOf("{")+2,email.indexOf("}")));
    }
}
