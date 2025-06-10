import java.util.ArrayList;
import java.util.Scanner;

// wap to print all the subsets from the set first 'n' natural nos
public class A5 {
    // funtion to print the subsets
    public static void printSubset(ArrayList<Integer> subset) {
        for (Integer integer : subset) { // printing subsets one by one
            System.out.print(integer);
        }
        System.out.println();
    }
    // funtion to find and store the subsets
    public static void findSubset(int n, int i, ArrayList<Integer> subset) {
        if (n<i) { // base case
            printSubset(subset);
            return;
        }
        // number taken
        subset.add(i);
        findSubset(n, i+1, subset);
        // number not taken
        subset.remove(subset.size()-1);
        findSubset(n, i+1, subset);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> subset= new ArrayList<>();
        System.out.println("Enter a natural no.");
        int n= sc.nextInt();
        findSubset(n, 1, subset);
    }
}