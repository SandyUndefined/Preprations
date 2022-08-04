package DSA_JAVA_beginner;

import java.util.List;
import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigit(n);
    }
    static void printDigit(int n){
        String number = Integer.toString(n);
        char[] digits = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            System.out.println(digits[i]);
        }
    }
}
