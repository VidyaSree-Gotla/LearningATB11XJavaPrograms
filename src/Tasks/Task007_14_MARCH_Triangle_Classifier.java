package Tasks;
import java.util.Scanner;
public class Task007_14_MARCH_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = s.nextInt();
        System.out.println("Enter b value : ");
        int b = s.nextInt();
        System.out.println("Enter c value : ");
        int c = s.nextInt();
        if(a==b && b==c){
            System.out.println("the given Triangle is Equilateral Triangle");
        }
        else  if (a==b || b==c || c==a){
            System.out.println("The Given Triangle is isosceles Triangle");
        }
        else
        System.out.println("The Given Triangle is scalene Triangle");
    }
}
