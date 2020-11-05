package com.scorsaro;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len -1);
        reverse(nums, 0 , k -1);
        reverse(nums, k, len -1);
    }

    private void reverse(int[] input, int start, int end){
        int tmp;
        while (start < end){
                tmp = input[start];
                input[start] = input[end];
                input[end] = tmp;
                start++;
                end--;
        }
    }
}
