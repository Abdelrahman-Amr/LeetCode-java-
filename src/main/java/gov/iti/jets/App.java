package gov.iti.jets;

import gov.iti.jets.array.ProductOfArrayExceptSelf;
import gov.iti.jets.array.TwoSum;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Hello world!
 *
 */
class Parent
{
    public  String toString()
    {
        return "parent";
    }
}

class Child extends Parent
{
    public  String toString()
    {
        return "child";
    }
}
public class App 
{

    public static void main( String[] args )
    {


    }
    public static void fun(Collection<?> col, Object o)
    {
        col.remove(o);
        col.forEach(System.out::println);
//        col.add(new RuntimeException());
//        col.add(new Exception());
    }
}
