package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_11_05_April_IsAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a character to check if it an Alphabet:");
        char c = sc.next().charAt(0);
        if((c >= 'a' && c<= 'z') ||(c>= 'A' && c<= 'Z')){
            System.out.println("Given Character is an alphabet");
        }
        else
            System.out.println("Given character is not an alphabet");
    }
}
