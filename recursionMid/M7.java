import java.util.Scanner;

// wap to print all the subsequences of a string
public class M7 {
    public static void subSequence(String str,String s, int i) {
        if (str.length()==i) { // base case
            System.out.println(s);
            return;
        }

        // if character is added
        subSequence(str, s+str.charAt(i), i+1);

        // if character is not added
        subSequence(str, s, i+1);
    }
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String str= sc.next();
        subSequence(str, "", 0);
    }
}
