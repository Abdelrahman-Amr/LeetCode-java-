package gov.iti.jets;

import gov.iti.jets.array.ProductOfArrayExceptSelf;
import gov.iti.jets.array.TwoSum;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductOfArrayExceptSelf x= new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(x.productExceptSelf(new int[]{0,0})));
//        System.out.println(Arrays.toString(x.productExceptSelf(new int[]{1,2,3,4})));


    }
}
