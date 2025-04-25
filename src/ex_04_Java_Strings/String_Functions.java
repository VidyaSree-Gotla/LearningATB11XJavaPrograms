package ex_04_Java_Strings;

public class String_Functions {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.length()); // Gives the length of the string
        System.out.println(s1.toLowerCase()); //Converts the String to lowercase
        System.out.println(s1.toUpperCase()); //Converts the entire string to upper case
        System.out.println(s1.concat(" World!!")); // Add the given string to the end of the string
        System.out.println((s1.contains("a"))); //Checks if the given substring is present in the main string and returns True/False
        System.out.println(s1.indexOf('e')); // Returns the index number of given character
        System.out.println(s1.charAt(0)); //Returns the character present at given Index
    }
}
