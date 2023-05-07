package gov.iti.jets.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num: nums)
        {
            set.add(num);
        }
        int i=0;
        for(int num: set)
        {
            nums[i] = num;
            i++;
        }
        return set.size();

    }
}
