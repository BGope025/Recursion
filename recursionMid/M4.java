import java.util.Scanner;

// wap to input an array and check if it is sorted(Strictly Increasing).
public class M4 {
    public static void check(int[] arr, int i, int l) {
        if (i==(l-1)){ // base case
            System.out.println("The list is sorted in strictly increasing order");
            return;
        }
        if (arr[i]>arr[i+1]) { // checking if unsorted
            System.out.println("**The list is NOT sorted**");
            return;
        }
        i+=1;
        check(arr, i, l);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l= sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements");
        for (int i=0;i<l;i++)
            arr[i]= sc.nextInt();
        check(arr, 0, l);
    }
}