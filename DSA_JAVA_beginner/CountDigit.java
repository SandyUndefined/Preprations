package DSA_JAVA_beginner;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digitCount(n);
    }

    static void digitCount(int n) {
        String number = Integer.toString(n);
        System.out.println(number.length());
    }
}
