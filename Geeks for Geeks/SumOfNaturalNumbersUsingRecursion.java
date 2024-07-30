public class SumOfNaturalNumbersUsingRecursion{

    static int find(int n){
        if(n == 0) return 0;

        return n + find(n-1);
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(find(n));
    }
}