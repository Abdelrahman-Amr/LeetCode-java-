package gov.iti.jets.array;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> loi=new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return loi;
        }


        Set<List<Integer>> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int num = 0 - (nums[i]+nums[j]);

                if(map.get(num)!=null  && map.get(num) >j )
                {

                    List<Integer> arr=new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(num);
                    List<Integer> xx = arr.stream().sorted().collect(Collectors.toList());
                    set.add(xx);
                }
            }
        }
        loi.addAll(set);
        return loi;
    }
}
