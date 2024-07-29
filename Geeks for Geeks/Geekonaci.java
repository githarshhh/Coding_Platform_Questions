import java.util.*;

class Geekonaci{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		for(int j=0; j<i; j++){
		   int a =  sc.nextInt();
		   int b =  sc.nextInt();
		   int c =  sc.nextInt();
		   int n =  sc.nextInt();
		   System.out.println( geek(a,b,c,n) );
		}
	}
	
	static int geek(int a, int b, int c, int n){
	    if(n == 1) return a;
	    else if(n == 2) return b;
	    else if(n == 3) return c;
	    
	    return geek(a,b,c,n-1) + geek(a,b,c,n-2) + geek(a,b,c,n-3);
	}
}
