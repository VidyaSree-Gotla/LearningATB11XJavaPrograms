package Tasks.Task019_06_April_Tasks;


import java.time.Year;
import java.util.Scanner;

public class Task019_16_06_April_Years_Months_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of days to convert to Years, Months and Days: ");
        int days = sc.nextInt();
        int Years, Months, Days =0;
        Years = days/365;
        days = days - (365*Years);
        System.out.println("Number of years are: "+Years);
        Months = days/30;
        days = days - (30*Months);
        System.out.println("Number of Months are: "+Months);
        Days = days % 30;
        System.out.println("Number of Days are: "+Days);


    }

}

