
import java.util.*;

public class Exercise27 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);

        System.out.print("First number?");
        int numFirst = kb.nextInt();
        System.out.print("Last number?");
        int numLast = kb.nextInt();

        if(numFirst > numLast){
            return;
        }
        while(numFirst <= numLast){
            System.out.println(numFirst);
            numFirst++;
        }


    }
}
