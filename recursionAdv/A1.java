import java.util.Scanner;

// wap to print all permutations of a string
public class A1 {
    public static void permutation(String str, String perm) {
        if (str.isEmpty()) { // base case
            System.out.println(perm);
            return;
        }
        // running loop to get to all the characters of the string
        for (int i=0;i<str.length();i++) {
            // storing the complete string by just removing the character at index i of string
            String s= str.substring(0,i)+str.substring(i+1);
            permutation(s,perm+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a word");
        String str= sc.next();
        permutation(str,"");
    }
}
