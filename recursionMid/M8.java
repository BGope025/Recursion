import java.util.HashSet;
import java.util.Scanner;

// wap to print all the unique subsequences of a string
public class M8 {
    public static void subSequence(String str,String s, int i, HashSet<String> set) {
        if (str.length()==i) { // base case
            if (set.contains(s))
                return;
            else {
                System.out.println(s);
                set.add(s);
                return;
            }
        }

        // if character is added
        subSequence(str, s+str.charAt(i), i+1, set);

        // if character is not added
        subSequence(str, s, i+1, set);
    }
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        HashSet<String> set= new HashSet<>();
        System.out.println("Enter the word");
        String str= sc.next();
        subSequence(str, "", 0, set);
    }
}
