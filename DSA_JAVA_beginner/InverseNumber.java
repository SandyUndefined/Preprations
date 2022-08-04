package DSA_JAVA_beginner;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInverse(n);
    }
    static void printInverse(int n){
        String number = Integer.toString(n);
        char [] digit = number.toCharArray();
        int len = number.length();
        for (int i = 0; i < len-1; i++) {
            if(!checkRepeat(digit, i, len)){
                if (checkDigit(digit,len)) {
                    
                }
            }
        }
    }

    static boolean checkDigit(char digit [], int len){
        for (int i = 0; i < digit.length; i++) {
            
        }
    }

    static boolean checkRepeat(char numbers [],int i, int len){
        for (int j = i + 1; j < len; j++) {
            if (numbers[i] == numbers[j]) {
                break;
            }
        }
        return false;
    }
}
