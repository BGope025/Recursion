import java.util.Scanner;

// wap to take a word from the user and put any specific element of the word chosen by the user at the end of the word
public class M5 {
    public static void check(String str, String s, String c, int i) {
        if (i==str.length()) { // base case
            s+=c; // adding all the xs' stored in separate string to the end of new string
            System.out.println("The restructured word is..."+s);
            return;
        }

        // adding all the xs' into a separate string
        if (str.charAt(i)=='x')
            c+='x';

        // adding all the other characters to the new string
        else
            s+=str.charAt(i);
        check(str, s, c, i+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word");
        String str= sc.next();
        check(str, "", "", 0);
    }
}
