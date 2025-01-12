package org.example;

import java.util.Objects;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a=121;
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int x) {

        if(x<0) return false;
        int reversed=0;
        int original=x;

        while (x != 0){
            int digit= x%10;
            reversed = reversed*10 + digit;
            x /= 10;
        }
        if(original==reversed) return true;
        else
            return false;
    }
}
