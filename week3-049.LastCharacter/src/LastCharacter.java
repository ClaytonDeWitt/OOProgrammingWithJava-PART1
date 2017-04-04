import java.util.*;

public class LastCharacter {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.next();
        System.out.println("Last character: " + lastCharacter(name));


    }
    public static char lastCharacter(String text){
        int name = text.charAt(text.length() - 1);
        return (char)name;

    }
}
