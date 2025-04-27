package Tasks.Task017_04_April_Tasks;

import java.util.Scanner;

public class Task017_04_04_April_IsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check if it is Vowel Or Not: ");
        char c = sc.next().charAt(0);
        if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            System.out.println("The given character is Vowel");
        }
        else
            System.out.println("Given character is not vowel");
    }
}
