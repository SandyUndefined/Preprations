package DSA_JAVA_beginner;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }
    static void reverse(int n){
        String number = Integer.toString(n);
        char [] digit = number.toCharArray();
        for (int i = digit.length -1; i >= 0; i--) {
            System.out.println(digit[i]);
        }
    }
}
