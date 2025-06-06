import java.util.Scanner;

// wap to input a no and it's power and calculate the value(stack height= log n)
public class B5 {
    public static int pow(int x,int n){
        if (x==0) // base case-1
            return 0;
        else if (n==0) // base case-2
            return 1;
        if(n%2==0) // if n is even
            return pow(x,n/2)*pow(x,n/2);
        else // if n is odd
            return pow(x,n/2)*pow(x,n/2)*x;
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