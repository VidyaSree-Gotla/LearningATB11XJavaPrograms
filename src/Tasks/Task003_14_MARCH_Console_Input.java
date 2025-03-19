package Tasks;

public class Task003_14_MARCH_Console_Input {
    public static void main(String[] args) {
        String name = args[0];
        String age = args[1];
        String Sal = args [2];
        int age_value = Integer.parseInt(age);
        int salary = Integer.parseInt(Sal);
        System.out.println(name);
        System.out.println(age_value);
        System.out.println(salary);
    }
}
