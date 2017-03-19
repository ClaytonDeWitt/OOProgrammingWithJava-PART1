import java.util.*;

public class Divider {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        double firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        double secondNumber = Integer.parseInt(reader.nextLine());

        double quotient = firstNumber / secondNumber;

        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + quotient);

    }

}
