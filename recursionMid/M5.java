import java.util.Scanner;

// wap to take a word from the user and put any specific element of the word chosen by the user at the end of the word
public class M5 {
    public static void check(String str, String s, String c, int i) {
        if (i==str.length()) { // base case
            s=s+c;
            System.out.println("The restructured word is..."+s);
            return;
        }
        if (str.charAt(i)=='x')
            c+='x';
        else
            s=s+str.charAt(i);
        check(str, s, c, i+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a word");
        String str= sc.next();
        check(str, "", "", 0);
    }
}
