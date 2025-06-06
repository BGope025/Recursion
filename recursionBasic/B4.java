import java.util.Scanner;

// wap to input a no and it's power and calculate the value
public class B4 {
    public static int pow(int x,int n){
        if (x==0)
            return 0;
        else if (n==0)
            return 1;
        int p1=pow(x,n-1);
        int p=x*p1;
        return p;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base no.");
        int x= sc.nextInt();
        System.out.println("enter the power");
        int n= sc.nextInt();
        System.out.println("The value is..."+pow(x,n));
    }
}