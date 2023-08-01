package gov.iti.jets.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    public int longestConsecutive2(int[] nums) {
        Set<Integer> all = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        int maxx=0;
        for(int i=0;i<nums.length;i++){
            if(!all.contains(nums[i]-1)){
                int c=0;
                int element = nums[i]-1;
                while(all.contains(++element)){
                    c++;
                }
                maxx = Math.max(c, maxx);
            }
        }

        return maxx;
    }

    }
