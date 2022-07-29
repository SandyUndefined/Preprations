package DSA_JAVA_beginner;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scn.nextInt();
            checkPrime(n);
        }
    }

    static void checkPrime(int n){
        int flag = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                flag = 1;
        }}
        if (flag == 1) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
     }
}
