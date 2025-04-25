package ex_20_Exceptions;

public class Try_Multiple_Catch {
    public static void main(String[] args) {
        int a=0;
        try{
            a=10/0;
        }catch (ArithmeticException e){
            System.out.println("Divide by Zero is not possible"); //if this is not an arithmetic exception then next catch block is executed which is hgh level.
        }
        catch (Exception e){
            System.out.println("High Level Exception description:"+e.getMessage());
        }
    }
}
