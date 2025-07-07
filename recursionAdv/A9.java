import java.util.Scanner;

// Given two integers N and K, wap to generate all positive integers with length N having an absolute difference of adjacent digits equal to K
public class A9 {
    public static boolean isSafe(int num, int i, int k, int x) {
        if (x == 0 && i != 0)
            return true;
        else if (i-(num%10)==k || (num%10)-i==k)
            return true;
        return false;
    }
    public static void cal(int num, int n, int k, int x) {
        if (x==n) {
            System.out.println(num);
        }
        int i=0;
        while (i<10) {
            if (isSafe(num, i, k, x)) {
                num=num*10+i;
                cal(num, n, k, x++);
                num=num/10;
            }
            
            i++;
        }
        if (i==10) {
            num=num/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n and k");
        int n= sc.nextInt();
        int k= sc.nextInt();
        cal(0, n, k, 0);
    }
}
