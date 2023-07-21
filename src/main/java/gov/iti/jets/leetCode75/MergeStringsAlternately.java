package gov.iti.jets.leetCode75;

import java.util.HashMap;
import java.util.Map;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.max(word1.length(), word2.length());
        StringBuilder merged= new StringBuilder();

        for(int i=0;i<len;i++){
            if(i<word1.length()){
                merged.append(word1.charAt(i));
            }
            if(i<word2.length()){
                merged.append(word2.charAt(i));
            }
        }
            return merged.toString();
    }

    public int[] twoSum(int[] nums, int target) {

       int l=0,r=nums.length-1;
       while(r>l){
           if(nums[l] + nums[r] ==target){
               return new int[]{nums[l], nums[r]};
           }else if(nums[l] + nums[r] <target) {
               l++;
           }else{
               r--;
           }
       }
       return null;
    }

}
