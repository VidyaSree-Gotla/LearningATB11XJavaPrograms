package Tasks.Task019_06_April_Tasks;

import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class Task019_17_06_April_URLType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a URL to check what type it is:");
        String input = sc.next();
        if(input.endsWith(".com")){
            System.out.println("The website type is: Commercial website");
        } else if (input.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (input.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (input.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (input.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (input.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        } else {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
