package ex_21_Generics;

public class Generic_Intro_Solution {
    public static void main(String[] args) {
        temp_sum1(3,4);
        temp_sum1(3.34,4.45);
        temp_sum1("Pramod","Dutta");


    }
    static <G> G  temp_sum1(G val1, G Val2){
        System.out.println(val1);
        System.out.println(Val2);
        return null;
    }
}
