import java.util.Scanner;

public class M11 {
    public static int partition(int[] arr, int low, int high) {
        int pivot= arr[high];
        int i= low-1;
        for (int j=low;j<high;j++){
            if (arr[j]< pivot){
                i++;
                // swap
                int t= arr[i];
                arr[i]= arr[j];
                arr[j]= t;
            }
        }
        i++;
        // swap
        int t= arr[i];
        arr[i]= pivot;
        arr[high]= t;
        return i; // pivot index
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low>high)
            return;
        int pivotIdx= partition(arr, low, high);
        quickSort(arr, low, pivotIdx-1);
        quickSort(arr, pivotIdx+1, high);
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
        quickSort(arr, 0, n-1);

        // printing data
        System.out.print("The sorted data is...\n| ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" | ");
    }
}
