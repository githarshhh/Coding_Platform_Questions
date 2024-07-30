public class IsArraySortedUsingRecursion {

    static boolean find(int[] arr, int i, int n){
        
        if(n == 1) return true;
        else if(i == n) return true;
        else if(arr[i] < arr[i-1]) return false;
        else return find(arr, i+1, n);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,20,25};
        int n = arr.length;
        System.out.println(find(arr,1,n));
    }
}
