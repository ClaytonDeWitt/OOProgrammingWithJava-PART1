import java.util.*;

public class Password {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        while (true) {
            System.out.println("Type a password: ");
            String command = reader.nextLine();

            if (command.equals(password)) {
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: 42");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
