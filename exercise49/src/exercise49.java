import java.util.*;

public class exercise49 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = kb.next();

        System.out.println("Last character: " + lastCharacter(name));


    }
    public static char lastCharacter(String name){

        char lastChar = name.charAt(name.length() - 1);
        return lastChar;



    }

}
