import java.util.*;

public class ReversingText {


    public static String reverse(String text) {
        int i = 0, len = text.length();
        String reversed_text = "";
        while ((len - 1 - i) >= 0){
            reversed_text = reversed_text + text.charAt(len - 1 - i);
            i++;

        }
        return reversed_text;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}

