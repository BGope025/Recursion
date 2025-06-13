import java.util.Scanner;

// Given two integers N and K, wap to generate all positive integers with length N having an absolute difference of adjacent digits equal to K
public class A9 {
    public static boolean isSafe(int num, int i, int k) {
        if (num == 0 && i != 0)
            return true;
        if (i-(num%10)==k || (num%10)-i==k)
            return true;
        return false;
    }
    public static void form(int num, int n, int k) {
        if (num/n>0 && num/n<=9) {
            System.out.println(num);
            return;
        }
        for (int i=0;i<9;i++) {
            if (isSafe(num, i, k)){
                num = num * 10 + i;
                form(num, n, k);
            }
        }
    }
    public static void real(int num, int n, int k){
        for (int i=1;i<=9;i++){
            num=i;
            form(num, (int) Math.pow(10,n-1), k);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n and k");
        int n= sc.nextInt();
        int k= sc.nextInt();
        real(0, n, k);

    }
}
