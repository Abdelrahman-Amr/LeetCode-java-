package gov.iti.jets.array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l=0, r = height.length-1;
        int max = Integer.MIN_VALUE;
        while(l<r)
        {
            int x = r - l;
            int y = Math.min(height[l], height[r]);
            max = Math.max(max, x*y);
            if(height[l] < height[r])
            {
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
