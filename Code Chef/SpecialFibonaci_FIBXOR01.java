import java.lang.*;
import java.util.*;
import java.io.*;

class SpecialFibonaci_FIBXOR01 {

public static int spfibo(int a, int b, int n) {
    if (n % 3 == 0) return a;
    else if (n % 3 == 1) return b;
    else if (n % 3 == 2) return a^b;
    
    return spfibo(a,b,n%3);
}

public static void main (String[] args) throws java.lang.Exception
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    while(t > 0){
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(spfibo(a,b,n));
        
        t--;
    }

	}
}

