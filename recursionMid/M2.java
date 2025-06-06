import java.util.Scanner;

// wap to reverse a string
public class M2 {
    public static void rev(String str, int i){
        if (i==0){
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        rev(str, i-1);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();
        rev(str,str.length()-1);
    }
}
