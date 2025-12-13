abstract class Shape{
    abstract void rectangleArea(float a,float b);
    abstract void squareArea(float a);
    abstract void circleArea(float a);
}
class Area extends Shape{
    void rectangleArea(float a,float b){
        System.out.println("The area of the rectangle is "+a*b);
    }
    void squareArea(float a){
        System.out.println("The area of the square is "+a*a);
    }
    void circleArea(float a){
        System.out.println("The area of the circle is "+a*3.14*a);
    }
}
public class _5Q5{
    public static void main(String[] args) {
        Area a=new Area();
        a.rectangleArea(5.0f, 4.5f);
        a.squareArea(5.0f);
        a.circleArea(9.8f);
    }
}