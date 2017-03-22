import java.util.*;

public class ManyPrints {

    public static void main (String[] args){
        int counter = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times should the text be printed? ");
        int timesPrinted = Integer.parseInt(reader.nextLine());
        while(counter < timesPrinted){
            printText();
            counter++;
        }

    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
