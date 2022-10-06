package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = scanner.nextInt();

        if(number >= 1) {
            System.out.println("Properties of " + number);
            System.out.println("even: " + isEven(number));
            System.out.println("odd: " + !isEven(number));
            System.out.println("buzz: " + isBuzz(number));
            System.out.println("duck: " + isDuck(number));
        } else {
            System.out.println("This number is not natural!");
        }
    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isBuzz(int number) {
        String numStr = String.valueOf(number);
        if (number % 7 == 0 || numStr.endsWith("7")) {
            return true;}
        else {return false;}
    }

    public static boolean isDuck (int number) {
        String numStr = String.valueOf(number);
        while (numStr.startsWith("0")) {
            numStr = numStr.substring(1);
        }
        if (numStr.contains("0")) {
            return true;
        } else {
            return false;
        }
    }
}