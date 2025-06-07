import java.util.Scanner;

// wap to find the first & last occurance of an element in a string.
public class M3{
    public static void count(String str,char s, int i,int first, int last) {
        if (str.length() == i){ // base case
            if (first==-1)
                System.out.println("**ERROR**\nElement not found");
            else
                System.out.println("The occurances of element "+s+" are..."+"\n"+"first-"+(first+1)+"\t"+"last-"+(last+1));
            return;
        }
        if (s == str.charAt(i)){
            if (first == -1) { // for first appearance
                first = i;
                last = i;
            } else // for repetition
                last = i;
        }
        count(str, s, i+1, first, last);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence or word");
        String str=sc.nextLine();
        System.out.println("Enter the element to search");
        char s=sc.next().charAt(0);
        count(str, s, 0, -1, -1);
    }
}