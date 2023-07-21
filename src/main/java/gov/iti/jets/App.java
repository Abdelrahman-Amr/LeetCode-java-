package gov.iti.jets;

import gov.iti.jets.array.ProductOfArrayExceptSelf;
import gov.iti.jets.array.TwoSum;
import gov.iti.jets.array.ValidAnagram;

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
class Vehicle {
    public void display() {
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle {
    public void display() {
        System.out.println("Car");
    }
}
class SportsCar extends Car {
    public void display() {
        System.out.println("SportsCar");
    }
}

public class App 
{

    public static void main( String[] args )
    {
        ValidAnagram v = new ValidAnagram();
        System.out.println(v.isAnagram("anagram", "nagaram"));



    }
    public static void fun(Collection<?> col, Object o)
    {
        Vehicle vehicle1 = new SportsCar();
        vehicle1.display();
        Car car1 =(Car) vehicle1;
        car1.display();
        SportsCar sportsCar1 = (SportsCar) car1;
        sportsCar1.display();

//        col.add(new RuntimeException());
//        col.add(new Exception());
    }
}
