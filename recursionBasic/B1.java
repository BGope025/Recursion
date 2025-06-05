// wap to print the sum of n natural nos.
import java.util.*;
public class B1 {
    public static void sum(int n,int s){
        s+=n;
        if(n==1){
            System.out.println("the sum is..."+s);
            return;
        }
        sum(n-1,s);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a natural no.");
        int n=sc.nextInt();
        sum(n,0);
    }
}
