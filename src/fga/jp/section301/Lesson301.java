/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fga.jp.section301;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Ay
 */

enum Color
{
    RED, GREEN, BLUE;
}

class Test<T>
{
    // An object of type T is declared
    T obj;
    
    Test(T obj) {  
        this.obj = obj;  
    }  // constructor
    
    public T getObject()  { 
        return this.obj; 
    }
}

public class Lesson301 {
    public static void main(String[ ] args) {
        
        //Enum
        
//        Color c1 = Color.RED;
//        Color c2 = Color.GREEN;
//        Color c3 = Color.BLUE;
//        System.out.print("Name of enum constant: ");
//        System.out.println(c1.name());
//        System.out.println(c2.name());
//        System.out.println(c3.name());
        
        //Generic Class
        
//        Test <Integer> iObj = new Test<Integer>(15); //integer
//        System.out.println(iObj.getObject());
//   
//        Test <String> sObj = new Test<String>("Java Programming"); //string
//        System.out.println(sObj.getObject());
//        
//        Test <Float> fObj = new Test<Float>(3.14f); //float
//        System.out.println(fObj.getObject());
        
        //Unbound Wildcards
                
//        List<Integer> list1= Arrays.asList(1,2,3); //Integer List       
//        List<Double> list2=Arrays.asList(1.1,2.2,3.3); //Double list
//        printlist(list1);
//        printlist(list2);
        
        //Upper Bounded Wildcards
        
//        List<Integer> list1= Arrays.asList(4,5,6,7); //Upper Bounded Integer List
//        System.out.println("Total sum is:"+sum(list1)); //printing the sum of elements in list
//        List<Double> list2=Arrays.asList(4.1,5.1,6.1); //Double list
//        System.out.print("Total sum is:"+sum(list2)); //printing the sum of elements in list
        
        //Lower Bounded Wildcards
//        List<Integer> list1= Arrays.asList(4,5,6,7); //Lower Bounded Integer List
//        printOnlyIntegerClassorSuperClass(list1); //Integer list object is being passed
//        List<Number> list2= Arrays.asList(4,5,6,7); //Number list
//        printOnlyIntegerClassorSuperClass(list2); //Integer list object is being passed
    }
    
    //Unbound Wildcards
    private static void printlist(List<?> list) 
    {
        System.out.println(list);
    }
    
    //Upper Bounded Wildcards
    private static double sum(List<? extends Number> list) 
    {
        double sum=0.0;
        for (Number i: list){
            sum += i.doubleValue();
        }
        return sum;
    }
    
    //Lower Bounded Wildcards
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }
}

