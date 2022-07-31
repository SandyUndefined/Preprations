package DSA_JAVA_beginner;

import java.util.*;

public class PrimeAll {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int i = low; i <= high; i++) {
            if(printPrime(i)){
                System.out.println(i);
            }
            
        }
    }

    static Boolean printPrime(int n){
        boolean flag = false;
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return false;
        } else {
            return true;
        }
    }
}
