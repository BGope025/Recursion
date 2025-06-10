import java.util.ArrayList;
import java.util.Scanner;

// Josephus problem
public class A6 {
    public static void eliminate(int i, int k, ArrayList<Integer> set) {
        if (set.size()==1) { // base case
            System.out.println("The survivor person is at position..."+set.get(0));
            return;
        }
        // setting index to the jumped index
        i=((i+k)%set.size());
        // removing the person
        set.remove(i);
        eliminate(i, k, set);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total no of people");
        int n= sc.nextInt();
        ArrayList<Integer> set= new ArrayList<>();
        for (int i=1;i<=n;i++)
            set.add(i);
        System.out.println("Enter no of jumps");
        int k= sc.nextInt();
        k--;
        eliminate(0, k, set);
    }
}
