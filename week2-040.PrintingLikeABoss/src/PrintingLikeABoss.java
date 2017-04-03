import java.util.*;

public class PrintingLikeABoss {

    public static void main (String[] args){
        xmasTree(10);


    }

        private static void printWhitespaces(int amount) {
            int i = 0;
            while (true) {
                if (i >= amount) {
                    break;
                }
                System.out.print(" ");
                i++;
            }
        }

        private static void printStars(int size) {
            int i = 0;
            while(true){
                if(i >= size){
                    break;
                }
                System.out.print("*");
                i++;
            }
            System.out.println("");
        }

        private static void printTriangle(int size){
            int i = 0;
            while(true){
                if(i >= size){
                    break;
                }
                printWhitespaces(size - (i + 1));
                printStars(i + 1);
                i++;
                }
            }


        private static void xmasTree(int height){
            int i = 0;
            while(true) {
                if (i >= height) {
                    break;
                }
                printWhitespaces(height - (i + 1));
                printStars((2 * i) + 1);
                i++;
            }
            printWhitespaces(height - 2);
            printStars(3);
            printWhitespaces(height - 2);
            printStars(3);
            }
        }


