package ex_19_Wrapper_Class;

public class String_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";
        int a = 10;
        //String to Wrapper -->using ParseX();
        Integer i1 = Integer.parseInt(num);
        Integer i2 = Integer.valueOf(num);
        System.out.println("String class converted to Wrapper: "+i1 +"\n"+i2);

        //Wrapper to String
        System.out.println("Wrapper class converted to String class: "+i1.toString());

        //String to Primitive
        int aa = Integer.parseInt(num);
        System.out.println("String converted to primitive type:"+aa);

        //Primitive to String
        int age = 10;
        Integer age_Wrapper = age;
        System.out.println("Primitive to String conversion: "+age_Wrapper.toString());
    }
}
