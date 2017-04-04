import java.util.*;

public class ReversingAName {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.next();
        int name_len = name.length();
        System.out.println("In reverse order: ");

        while(name_len >=1){
            System.out.println(name.charAt(name_len - 1));
            name_len--;
        }

    }
}
