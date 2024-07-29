import java.util.Scanner;

public class LengthOfString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine() ;
        System.out.println(length(str));;
    }

    static int length(String s){
        if(s.equals(""))return 0;
        else return length(s.substring(1)) + 1;
    }
}
