package Tasks;
import java.util.Scanner;
public class Task008_20_March_Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        int val = 0;
        int a = 1;
        int b = 0;
        if(number<=1)
            System.out.println(1);
        else {
            for (int i = 2; i <= number; i++) {
                val = a + b;
                b = a;
                a = val;
            }
            System.out.println(val);
        }

    }
}
