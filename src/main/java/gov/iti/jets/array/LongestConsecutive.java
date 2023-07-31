package gov.iti.jets.array;

import java.util.Arrays;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        int l=0,r=1,c=1,maxx=0;
        while(l<nums.length-1){
            if(nums[l+1]== nums[l]+1 ){
                c++;
            }else if( nums[l+1] == nums[l]){

            }else {
                c=1;
            }
            l++;
            maxx = Math.max(maxx,c);
        }

        return maxx;
    }
}
