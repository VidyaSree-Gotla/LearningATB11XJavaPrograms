package Tasks;
import java.util.Scanner;



public class Task006_14_MARCH_Even_Odd {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
     System.out.println("Enter a value : ");
     int a = s.nextInt();
        String result = a%2 ==0 ? "a is Even" : "a is Odd";
        System.out.println(result);
    }
}
