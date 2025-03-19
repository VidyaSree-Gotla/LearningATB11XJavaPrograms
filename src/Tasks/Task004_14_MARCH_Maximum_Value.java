package Tasks;

public class Task004_14_MARCH_Maximum_Value {
    public static void main(String[] args) {
        String a = args [0];
        String b = args [1];
        int val1 = Integer.parseInt(a);
        int val2 = Integer.parseInt(b);
        int val3 = val1>val2 ? val1 : val2;
        System.out.println("Maximum Value is "+val3);
    }
}
