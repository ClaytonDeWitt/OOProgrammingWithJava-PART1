import java.util.*;

public class FirstCharacter {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.next();
        System.out.println("First character: " + firstCharacter(name));

    }

    public static char firstCharacter(String text){
       char firstChar = text.charAt(0);
       return firstChar;


    }
}
