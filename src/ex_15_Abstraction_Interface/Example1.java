package ex_15_Abstraction_Interface;

public class Example1 {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        s.getArea(3,6);
        r.getArea(7,3);
    }
}
abstract interface Polygon{
    abstract void getArea(int a, int b);
}
class Square implements Polygon{
    @Override
    public void getArea(int a,int b) {
        System.out.println("Area of square is:" + a*b);
    }
}
class Rectangle implements Polygon{
    @Override
    public void getArea(int a, int b) {
        System.out.println("Area of Rectangle is: " + 3.14*a*b);
    }
}