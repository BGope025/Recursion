import java.util.Scanner;

// wap to remove all the duplicate elements from a word
public class M6 {
    public static void duplicate(String str, String s, int i) {
        if (str.length()==i) { // base case
            System.out.println("The new word is..."+s);
            return;
        }

        // adding the element which occurred for the first time to new string
        if (s.indexOf(str.charAt(i))==-1)
            s+=str.charAt(i);
        duplicate(str, s, i+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word");
        String str= sc.next();
        duplicate(str, "", 0);
    }
}
