import java.util.*;

public class Average {

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int numbers : list) {
            sum = sum + numbers;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {

        double average = (double)sum(list) / list.size();
        return average;

        }
    

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));


    }
}
