/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fga.jp.section1;
import java.util.Scanner;
/**
 *
 * @author Ay
 */
public class Lesson101 {
    public static void main(String[] args) {
        
/*****************Slide8*****************/
/**********Primitive Data Types**********/
        
//        boolean result= true;
//        char capitalC= 'C';
//        byte b= 100;
//        short s= 10000;
//        int i= 100000;
//        long creditCardNumber= 1234_5678_9012_3456L;
//        
//        System.out.println(result);
//        System.out.println(capitalC);
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(creditCardNumber);
                
/*****************Slide10*****************/
/****************Variables****************/
        
//        int iNum= 25;
//        char cVal= 'B';
//        boolean bVal= true;
//        //display all values to screen
//        System.out.println(iNum);
//        System.out.println(cVal);
//        System.out.println(bVal);

/*****************Slide13*****************/
/***********String Operation 1************/
        
//        String str1= "Hello";
//        String str2= "Fuke";
//        String str3; //uninitialized string
//        
//        //create a new string by concatenation
//        str3= "You are "+ str2;
//        //display a welcome message to screen
//        System.out.println("Welcome: "+ str3);
//        //Display the length of a string
//        System.out.println("Length: "+ str1.length());
//        //Display a substring of str1 beginning with character 0,
//        //up to, but not including character 5
//        System.out.println("Sub: "+ str3.substring(0,5));
//        //display a string value in uppercase
//        System.out.println("Upper: "+str2.toUpperCase());

/*****************Slide21*****************/
/***********String Operation 2************/
        
//        String str1 ="Halo";
//        String str2 ="helo";
//        
//        //Compare 2 Strings to see if they are the same or  
//        //identify which String value comes first
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.compareToIgnoreCase(str2));
//        //Compare 2 Strings to see if they are the same
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
        
/*****************Slide25*****************/
/*************Console Input**************/
        
//        Scanner in= new Scanner(System.in);
//        boolean boolVal;
//        byte byteVal;
//        char charVal;
//        short shortVal;
//        int intVal;
//        long longVal;
//        float floatVal;
//        double doubleVal;
//
//        System.out.print("Please enter a booleanvalue: ");
//        boolVal= in.nextBoolean();
//        System.out.print("Please enter a byte value: ");
//        byteVal= in.nextByte();
//        System.out.print("Please enter a char value: ");
//        charVal= in.next().charAt(0);
//        System.out.print("Please enter a short value: ");
//        shortVal= in.nextShort();
//        System.out.print("Please enter an int value: ");
//        intVal= in.nextInt();
//        System.out.print("Please enter a long value: ");
//        longVal= in.nextLong();
//        System.out.print("Please enter a float value: ");
//        floatVal= in.nextFloat();
//        System.out.print("Please enter a double value: ");
//        doubleVal= in.nextDouble();
//        in.close();
//        
//        System.out.println("booleanvalue: "+ boolVal);
//        System.out.println("byte value : "+ byteVal);
//        System.out.println("char value : "+ charVal);
//        System.out.println("short value : "+ shortVal);
//        System.out.println("int value : "+ intVal);
//        System.out.println("long value : "+ longVal);
//        System.out.println("double value : "+ floatVal);
//        System.out.println("double value : "+ doubleVal);
        
/*****************Slide33*****************/
/*********Conditional Statement 1*********/
        
//        Scanner in= new Scanner(System.in);
//        int age;
//        System.out.print("Please enter your age: ");
//        age = in.nextInt();
//        if(age> 20)
//            System.out.println("You are an adult");
//        else
//            System.out.println("You are not an adult");
//        //endif
//        in.close();

/*****************Slide37*****************/
/*********Conditional Statement 2*********/
        
//        Scanner in= new Scanner(System.in);
//        int age;
//        char holdLicence;
//        System.out.print("Please enter your age: ");
//        age= in.nextInt();
//        System.out.print("Do you hold a current driving licence? ");
//        holdLicence= in.next().charAt(0);
//        
//        if((age> 20) && (holdLicence== 'y'))
//            System.out.println("You are an adult and can hire a car");
//        else
//            System.out.println("You are not an adult so cannot hire a car");
//        
//        //endif
//        in.close();

/*****************Slide44*****************/
/******************Loops******************/
        
//        Scanner in= new Scanner(System.in);
//        int value= 0;
//        do{
//            System.out.println("Enter a number:");
//            value= in.nextInt();
//            if( value== 7)
//                System.out.println("That's lucky!");
//            else if( value== 13)
//                System.out.println("That's unlucky!");
//            else if(value!=0)
//                System.out.println("That number is neither lucky nor unlucky!");
//        //end if
//        }while(value!=0);
//        in.close();

/*****************Slide47*****************/
/******************Array******************/
        
//        int[] numbers= new int[5];
//        Scanner in= new Scanner(System.in);
//        int num=0, numValues=0;
//        boolean valid= true;
//        
//        while(numValues<numbers.length) {
//            do{
//                valid=true;
//                System.out.print("Please enter a unique number: ");
//                num= in.nextInt();
//                for(int i= 0; i<numValues; i++)
//                {
//                    if(num== numbers[i]) {
//                    System.out.println("Number already exists");
//                    valid= false;
//                    break;
//                    }//endif
//                }//endfor
//            }while(!valid);
//            numbers[numValues] = num;
//            numValues++;
//        }//endwhile
//        in.close();
//        for(int numV: numbers)
//            System.out.println("Number Value: "+ numV);
//        //endfor
        
    }//end method main
}
