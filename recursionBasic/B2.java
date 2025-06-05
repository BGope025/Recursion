// wap to print factorial of a no.
import java.util.*;
public class B2 {
    public static void fact(int n,int f){
        if (n==0){
            System.out.println("the factorial is...0");
            return;
        }
        f*=n;
        if (n==1){
            System.out.println("the factorial is..."+f);
            return;
        }
        fact(n-1,f);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a natural no.");
        int n=sc.nextInt();
        fact(n,1);
    }
}
