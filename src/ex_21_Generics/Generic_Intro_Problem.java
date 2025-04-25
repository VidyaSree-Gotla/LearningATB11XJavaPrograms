package ex_21_Generics;

public class Generic_Intro_Problem {
    //Generics in Java allow us to create classes, interfaces, and methods where the type of the data is specified as a parameter.
    // If we use generics, we do not need to write multiple versions of the same code for different data types.
    public static void main(String[] args) {
       int res1=temp_sum(2,6);
        System.out.println("Int sum is: "+res1);
        double res2 = temp_sum(3.33,6.46);
        System.out.println("Double sum is: "+res2);
        float res3 = temp_sum(4.3f,3.5f);
        System.out.println("Float sum is: "+res3);
        String res4 = temp_sum("Hello", "World");
        System.out.println("String Sum is: "+res4);

    }
    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static float temp_sum(float a, float b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
}

