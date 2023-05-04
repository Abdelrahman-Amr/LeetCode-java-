package gov.iti.jets.array;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }
}
