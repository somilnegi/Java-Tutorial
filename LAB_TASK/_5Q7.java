abstract class Temperature {
    double temp;
    void setTempData(double temp) {
        this.temp = temp;
    }
    abstract void changeTemp();
}
class Fahrenheit extends Temperature {
    double ctemp;
    void changeTemp() {
        ctemp = (5.0 / 9.0) * (temp - 32); 
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}
class Celsius extends Temperature{
    double ftemp;
    void changeTemp() {
        ftemp = (9.0 / 5.0) * temp+32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }

}
public class _5Q7{
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setTempData(98.6); 
        fahrenheit.changeTemp();  
        Celsius celsius= new Celsius();
        celsius.setTempData(37.0);
        celsius.changeTemp();
    }
}
