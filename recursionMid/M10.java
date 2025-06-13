import java.util.Scanner;

// Merge sort
public class M10 {
    public static void conquer(int[] arr, int si, int mid, int ei) {
        // creating a helper array and storing the sorted data into it
        int[] merge = new int[ei-si+1];
        int idx1= si,idx2= mid+1,i= 0;
        while (idx1<= mid && idx2<= ei) {
            if (arr[idx1] <= arr[idx2])
                merge[i++]= arr[idx1++];
            else
                merge[i++]= arr[idx2++];
        }
        while (idx1<= mid)
            merge[i++]= arr[idx1++];
        while (idx2<= ei)
            merge[i++]= arr[idx2++];

        // adding the sorted data from helper array to original array
        for (i=0, idx1=si;i< merge.length;i++, idx1++)
            arr[idx1]= merge[i];
    }
    public static void divide(int[] arr, int si, int ei) {
        if (si>=ei)
            return;
        int mid= si + (ei-si)/2; // if si and ei both are bigger values the output could come incorrect ie one greater
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int[] arr= new int[n];

        // taking data
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
            arr[i]= sc.nextInt();

        // sorting data
        divide(arr,0, n-1);

        // printing data
        System.out.print("The sorted data is...\n| ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" | ");
    }
}
