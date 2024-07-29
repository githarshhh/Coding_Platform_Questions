import java.util.*;
  
public class SumOfDigitsUsingRecursion 
{
    public static int sum_of_digit(int num)
    { 
        if (num == 0)
            return 0;
        return (num % 10 + sum_of_digit(num / 10));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int res=sum_of_digit(num);
        System.out.println("The sum of digits is: "+res);
    }
}