package selfwork.leetcode;

class Solution {
    static int[] nums = {1, 2, 3, 1};

    public static void main(String[] args) {
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums));
    }


    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}