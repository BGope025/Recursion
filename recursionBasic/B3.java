import java.util.Scanner;

// wap to print a palindrome series till nth term
public class B3 {
    public static void pal(int a,int b,int n){
        int k=b;
        b=a+b;
        a=k;
        if (n>=b){
            System.out.print(","+b);
            pal(a,b,n);
        }
        else
            return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a natural no.");
        int n= sc.nextInt();
        if (n>0){
            System.out.println("the palindrome series is...");
            int a=0,b=1;
            System.out.print(a+","+b);
            pal(a,b,n);
        }
        else
            System.out.println("**Invalid input**");
    }
}
