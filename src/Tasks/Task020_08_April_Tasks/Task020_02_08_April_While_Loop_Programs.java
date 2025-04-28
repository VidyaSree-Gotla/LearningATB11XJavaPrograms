package Tasks.Task020_08_April_Tasks;

public class Task020_02_08_April_While_Loop_Programs {
    public static void main(String[] args) {
        //Print numbers from 1 to 10
        System.out.println("Program 1: Print numbers from 1 to 10");
        int i=1;
        while(i<+10){
            System.out.println(i);
        }
        //Print Even numbers from 1 to 20
        System.out.println("Program 2: Printing Even numbers from 1 to 20");
        int j=1;
        while (j%2==0){
            System.out.println(j);
        }
        //Print JAVA 5 times
        System.out.println("Program 3: Printing JAVA 5 times");
        int k=0;
        while(k<5){
            System.out.println("JAVA");
        }
        // Print the sum of first 10 natural numbers
        int sum=0;int l = 0;
        System.out.println("Program 4:  Print the sum of first 10 natural numbers");
        while(l<=10){
            sum = sum+l;
        }
        System.out.println(sum);
        //Print the multiplication table of 7
        System.out.println("Print the multiplication table of 7");
        int res=7; int m =0;
        while(m<=10){
            System.out.println(res +"*"+m+"="+res*m);
        }
    }
}
