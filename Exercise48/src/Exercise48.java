import java.util.*;
public class Exercise48 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = kb.next();

        System.out.println("First character: " + firstCharacter(name));

    }


    public static char firstCharacter(String name){
        return name.charAt(0);

    }
}
