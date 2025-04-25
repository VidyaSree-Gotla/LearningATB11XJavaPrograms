package ex_20_Exceptions;

public class Exceptions_Explained {
    public static void main(String[] args) {
//        String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException -->if we use args with out passing any input in command line.
//        int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
//        int output = 100/a; // java.lang.ArithmeticException: / by zero
//        System.out.println(output);
        // Checked Exception
//        FileInputStream fileInputStream = new FileInputStream("C://testdata.txt"); // if the file is not present in the mentioned location
        //FileNotFoundException
        String name = null;
        name.trim(); //Null Pointer exception as value of string is null.

    }
}
