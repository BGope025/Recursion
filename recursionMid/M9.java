import java.util.Scanner;

// wap to print keypad combination
public class M9 {
    // funtion that stores the values corresponding to key
    public static String[] keypad= {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void combination(String str, int i, String s) {
        if (i==str.length()) { // base case
            System.out.println(s);
            return;
        }

        // taking the corresponding values of the no at the index
        String map= keypad[str.charAt(i) - '0'];

        // running a for loop to fetch all the elements in the string data
        for (int n=0;n<map.length();n++)
            combination(str, i+1, s+map.charAt(n));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number pattern");
        String str= sc.next();
        combination(str, 0, "");
    }
}
