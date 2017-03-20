import java.util.*;

public class upToCertainNumber {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        int num = 1;

        System.out.println("Up to what number? ");
        int input = Integer.parseInt(reader.nextLine());

        while(num <= input){
            System.out.println(num);
            num++;
        }


    }
}
