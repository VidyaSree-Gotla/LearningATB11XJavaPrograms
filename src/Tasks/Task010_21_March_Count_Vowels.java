package Tasks;
import java.util.Scanner;
public class Task010_21_March_Count_Vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter input String");
        String input = sc.next();
        int vowels=0,consonents=0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowels++;
            }
            else{
                consonents++;
            }

        }
        System.out.println("vowels= "+vowels);
        System.out.println("consonents= " +consonents);

    }
}
