import java.util.Scanner;

// wap to count the total no of possible paths in a maze to move from (0,0) to (n,m)
public class A2 {
    public static int pathCount(int i, int j, int n, int m) {
        if (i==n || j==m) // base case
            return 0;
        if (i==n-1 && j==m-1) // base case
            return 1;
        // moved rightwards
        int rightPath= pathCount(i+1, j, n, m);
        // moved downwards
        int downPath= pathCount(i, j+1, n, m);
        // returning the total no of paths
        return rightPath+downPath;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the index of the final box");
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println("The no of possible paths are..."+pathCount(0, 0, n, m));
    }
}