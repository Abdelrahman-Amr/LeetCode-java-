package gov.iti.jets.array;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int result = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                result = i;
                break;
            }
        }
        (new String("a")).length();
        return result;
    }
}
