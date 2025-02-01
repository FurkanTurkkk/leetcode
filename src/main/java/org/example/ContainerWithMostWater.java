package org.example;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] test = {1,8,6,2,5,4,8,3,7};
        System.out.println(calculateArea(test));
    }

    public static int calculateArea(int[] height){
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
