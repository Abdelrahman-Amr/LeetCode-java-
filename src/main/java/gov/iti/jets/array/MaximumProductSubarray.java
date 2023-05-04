package gov.iti.jets.array;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int tempMax = Math.max(nums[i]*max, Math.max(min*nums[i],nums[i]));
            min = Math.min(nums[i]*max, Math.min(min*nums[i],nums[i]));
            max = tempMax;
            result = Math.max(max,result);
        }
        return result;
    }
}
