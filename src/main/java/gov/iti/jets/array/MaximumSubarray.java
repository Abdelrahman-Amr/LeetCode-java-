package gov.iti.jets.array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > sum + nums[i]) {
                sum = nums[i];
            } else {
                sum = sum + nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }
}
