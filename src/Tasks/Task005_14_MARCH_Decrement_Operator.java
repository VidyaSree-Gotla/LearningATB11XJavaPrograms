package Tasks;

public class Task005_14_MARCH_Decrement_Operator {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        //--a-->20-1 = (19) -->a=19
        //a++ -->19 +19 -->38 -->a=20
        //a-- -->28+20 -->58 -->a=19
        //Output -->58  19
    }
}
