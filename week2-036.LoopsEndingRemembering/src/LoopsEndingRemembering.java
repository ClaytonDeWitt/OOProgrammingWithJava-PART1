import java.util.*;


public class LoopsEndingRemembering {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int typedNumber = 0, sum = 1, counter = -1, evenNumbers = 0;

        while (true) {
            typedNumber = Integer.parseInt(reader.nextLine());
            sum = sum + typedNumber;
            counter++;

            if(typedNumber % 2 == 0){
                evenNumbers++;
            }
            if (typedNumber < 0) {
                System.out.println("You typed " + counter + "numbers!");
                System.out.println("The sum is " + sum);
                System.out.println("Average: " + sum*1.0/counter);
                System.out.println("Even numbers: " + evenNumbers);
                System.out.println("Thank you and see you later! ");
                System.out.println("Odd numbers: " + (counter - evenNumbers));
                break;
            }

        }
    }
}
