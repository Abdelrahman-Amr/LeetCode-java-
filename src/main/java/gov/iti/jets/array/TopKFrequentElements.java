package gov.iti.jets.array;

import java.util.HashMap;
import java.util.Map;


public class TopKFrequentElements {
    public static int x;
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){

            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[k];
        int j=0;
        for(int i = 0 ; i< k ;i++){
            int count = 0;
            int max = 0;
            for(Map.Entry<Integer,Integer> val : freq.entrySet()){
                if(val.getValue() > count){
                    count = val.getValue();
                    max = val.getKey();
                }
            }
            freq.put(max,0);
            arr[j] = max;
            j++;
        }
        return arr;

    }
}
