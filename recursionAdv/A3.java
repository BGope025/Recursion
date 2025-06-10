import java.util.Scanner;

// wap to count the total ways to place tiles of size 1Xm into a floor of size nXm
public class A3 {
    public static int tileCount(int n, int m) {
        if (n==m) // base case: could be place both horizontally or vertically only
            return 2;
        if (n<m) // base case: no space to place it vertically
            return 1;
        // vertical placement
        int verticalPlacement= tileCount(n-m, m);
        // horizontal placement
        int horizontalPlacement= tileCount(n-1, m);
        return verticalPlacement+horizontalPlacement;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the room");
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println("The no of possible tile placements are..."+tileCount(n, m));
    }
}