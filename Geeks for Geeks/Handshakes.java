import java.util.HashMap;
import java.util.Map;

public class Handshakes {
    
    public static Map <Integer, Integer> memo = new HashMap<>();
    static int count(int N) 
    {   
        int n = N/2;
        
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        
        if(n<=1) return 1;
        
        int result = 0;
        
        for(int i=0; i<n; i++){
            result += count(i*2) * count((n-1-i)*2);
        }
        
        memo.put(n,result);
        
        return result;
    }
}
