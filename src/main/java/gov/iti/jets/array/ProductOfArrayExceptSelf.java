package gov.iti.jets.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int fact2 = 1,fact3=1;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            fact2 *=nums[i];
            if(nums[i]!=0)
            {
                fact3 *=nums[i];
            }else{
                c++;
            }
        }
        int pref[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(c>1)
            {
                pref[i]=0;
            }
            else if(nums[i] == 0)
            {
                pref[i]  = fact3 ;
            }else {
                pref[i] = fact2 / nums[i];
            }
        }
        return pref;
    }
}
