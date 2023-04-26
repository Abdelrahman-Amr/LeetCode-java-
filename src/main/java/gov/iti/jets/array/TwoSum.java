package gov.iti.jets.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freq= new HashMap<>();

        int result[] = new int[2];
        int n = nums.length;
        for(int i=0; i<n ; i++)
        {

            int x = target - nums[i];
            Integer y = freq.get(x);
            if( y != null && y!=i)
            {
                result[0] = i;
                result[1] = y;
                break;
            }
            freq.put(nums[i], i);

        }
        return result;
    }
}
