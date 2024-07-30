public class isPrimeUsingRecursion {

    static boolean find(int n, int i){
        if(n <= 2) return true;
        else if(n % i == 0) return false;
        else if(i * i > n) return true;
        
        return find(n, i+1);
    }

    public static void main(String[] args){
        int n = 6;
        System.out.println(find(n,2));
    }
}
