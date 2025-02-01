package org.example;

public class NumSub {
    public static void main(String[] args) {

    }
    public static int numSub(String s) {
        long count = 0, result = 0;
        int MOD = 1_000_000_007;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;  
                result = (result + count) % MOD;
            } else {
                count = 0;
            }
        }

        return (int) result;

    }
}
