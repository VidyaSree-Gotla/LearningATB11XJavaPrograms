package Tasks;
import java.util.Scanner;
import java.lang.String;
public class Task011_21_March_Palindrome {
    public static void main(String[] args) {
        System.out.println("Input a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String reverse = "";
        for (int i=input.length()-1;i>=0;i--){
        reverse = reverse+input.charAt(i);
        }
      boolean output= reverse.equalsIgnoreCase(input);
        if(output==true) {
            System.out.println(input + " is a Palindrome");
        }
        else
            System.out.println(input + " is not a Palindrome");
    }
}
