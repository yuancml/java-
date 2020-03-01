package com.class_que_10;

public class Solution {
    public int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            System.out.println(i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
class Sum{
    public static void main(String[] args){
        int[] num = {2, 7, 11, 15};
        int sum = 9;
        Solution solu = new Solution();
        solu.twosum(num, sum);

    }
}
