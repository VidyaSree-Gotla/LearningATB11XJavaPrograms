package Tasks;

public class Task002_14_MARCH_Increment_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //Line NO | EXP(a) | Value (a)
        //++a = 10+1+11 -->a=11 +
        //a++ = 11 -->11+11-->22 -->a=12 +
        //a++ -->22+12 =34 -->a=13

        //OUTPUT will be
        //34
        //13

    }
}
