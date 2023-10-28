package com.example;


public class W03Arrays {
    private W03Arrays() {}

    private static final int[] array = new int[] {1, 2, 3, 4, 5};
    private static final int[] anotherArray = new int[] {1, 2, 3, 4, 1};

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // TODO: https://leetcode.com/problems/number-of-good-pairs/
    public static int numIdenticalPairs(int[] nums) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(array));
        System.out.println(containsDuplicate(anotherArray));
    }
}
