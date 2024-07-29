import java.io.*;
import java.util.*;
  
public class ProductOfTwoNumbersUsingRecursion 
{
    static int findProduct(int num1, int num2)
    {
        // if x is less than y then swap the numbers
        if (num1 < num2)
            return findProduct(num2, num1);
      
        // iteratively calculate y times sum of x
        else if (num2 != 0)
            return (num1 + findProduct(num1, num2 - 1));
      
        // if any of the two numbers is zero return zero
        else
            return 0;
    }
    public static void main (String[] args)
    {
        int num1 = 7;
        System.out.println("The first entered number is: "+num1); 
        int num2 = 8;
        System.out.println("The second entered number is: "+num2); 
        System.out.print("The product of the two numbers is "); 
        System.out.println(findProduct(num1, num2)); 
    }
}

