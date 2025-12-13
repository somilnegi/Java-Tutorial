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
        ctemp = (5.0 / 9.0) * (temp - 32); // Conversion formula from Fahrenheit to Celsius
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}
public class _5Q6{
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setTempData(98.6); // Setting Fahrenheit temperature
        fahrenheit.changeTemp();      // Converting and displaying temperature in Celsius
    }
}
