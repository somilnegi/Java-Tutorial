abstract class Computer //Abstract class cannot be instantiated, they can have abstract or normal methods
{
    public abstract void compiler(); //Abstract methods do not have body
}

// interface Computer { // Everything in interface is public and abstract
//     void compiler();
// } 
// interfaces are implemented using 'implements', multiple interfaces can be implemented
class Desktop extends Computer { //Any class extending an abstract class should implement the abstract method
    public void compiler() {
        System.out.println("Compiling faster...");
    }
}

class Laptop extends Computer {
    public void compiler() {
        System.out.println("Compiling...");
    }
}

class Dev {
    public void code(Computer com) {
        System.out.println("Coding...");
        com.compiler();
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        Desktop desk1 = new Desktop();
        Computer lap2 = new Laptop();
        Computer desk2 = new Desktop();
        Dev dev1 = new Dev();
        dev1.code(lap2);
    }
}
