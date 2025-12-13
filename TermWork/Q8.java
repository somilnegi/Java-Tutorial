abstract class Shape {
    abstract double rectangleArea(double length, double width);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}
class Area extends Shape {
    double rectangleArea(double length, double width) {
        return length * width;
    }
    double squareArea(double side) {
        return side * side;
    }
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
public class Q8{
    public static void main(String[] args) {
        Area areaCalculator = new Area();
        double rectangleLength = 5.0;
        double rectangleWidth = 3.0;
        double rectangleArea = areaCalculator.rectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);
        double squareSide = 4.0;
        double squareArea = areaCalculator.squareArea(squareSide);
        System.out.println("Area of the square: " + squareArea);
        double circleRadius = 2.5;
        double circleArea = areaCalculator.circleArea(circleRadius);
        System.out.println("Area of the circle: " + circleArea);
    }
}
