package Tasks.Task020_08_April_Tasks;

public class Task020_01_08_April_For_Loop_Programs {
    public static void main(String[] args) {
        //Print Numbers from 1 to 10
        System.out.println("Program 1: Printing numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
            //Print Even numbers from 1 to 20
            System.out.println("Program 2: Printing Even numbers from 1 to 20");
            for (int j = 1; j <= 20; j++) {
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }
            //Print HELLO 5 times
            System.out.println("Program 3: Printing HELLO 5 times");
            for (int k = 0; k < 5; k++) {
                System.out.println("Hello");
            }
            // Print the sum of first 10 natural numbers
            int sum = 0;
            System.out.println("Program 4:  Print the sum of first 10 natural numbers");
            for (int l = 1; l <= 10; l++) {
                sum = sum + l;
            }
            System.out.println(sum);
            //Print the multiplication table of 5
        System.out.println("Print the multiplication table of 5");
        int res=5;
        for(int m =0; m<=10;m++){
            System.out.println(res +"*"+m+"="+res*m);
        }

    }
}


