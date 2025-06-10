import java.util.Scanner;

// wap to print the no of ways one could invite 'n' people to a party: single or pair
public class A4 {
    public static int invite(int n) {
        if (n==2) // base case
            return 2;
        if (n==1) // base case
            return 1;
        //  for single
        int singleCall= invite(n-1);
        // for pair
        int pairCall= (n-1)*invite(n-2);
        return singleCall+pairCall;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of guests");
        int n= sc.nextInt();
        System.out.println("The no of ways to call those guests are..."+invite(n));
    }
}