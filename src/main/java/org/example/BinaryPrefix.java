package org.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefix {
    public static void main(String[] args) {
        int[] num={1,0,0,1,0,1};
        System.out.println(prefixesDivBy5(num));
    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;

        for (int bit : nums) {
            num = (num * 2 + bit) % 5;
            list.add(num == 0);
        }

        return list;
    }
}
