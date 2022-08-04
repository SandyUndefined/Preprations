package DSA_JAVA_beginner;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibbo(n);
    }
    static void printFibbo(int n){
        int a = 0 , b =1, c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            a =b;
            b=c;
            System.out.println(c);
        }
    }
}
