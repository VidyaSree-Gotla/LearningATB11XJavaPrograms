package ex_18_ENUM;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(colors.RED.getHexCode());
        System.out.println(Project_URLs.google.getUrl());
    }

    public enum days{
    //ENUM is special datatype which allows us to store constant data
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY //list of constant values can be given separated by comma.

    }
}




