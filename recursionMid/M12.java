import java.util.Scanner;

// wap to solve a mathematical operation called combination
public class M12 {
    public static double combination(double ans, int n, int r) {
        if (r==0) // base case
            return 1.0;
        ans= combination(ans, n, r-1)*(n-r+1)/r;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // taking input
        System.out.println("Enter number and then base");
        int n= sc.nextInt();
        int r= sc.nextInt();
        // printing output
        System.out.println(combination(1, n, r));
    }
}
