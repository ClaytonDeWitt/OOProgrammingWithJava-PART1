import java.util.*;

public class TheEndPart {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String answer = reader.nextLine();
        System.out.print("Length of the end part: ");
        int answerLen = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + answer.substring(answer.length() - answerLen, answer.length()));



    }
}
