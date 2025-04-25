package ex_20_Exceptions;

public class Multiple_Exceptions {
    public static void main(String[] args) {
        try{
            String s = args[0];
            int a = Integer.parseInt(s);
            int output = a/0;
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e){
            System.out.println("More Exceptions: "+e.getMessage());
        }
    }
}
