class Vehicle {
    void start() {
        System.out.println("Starting the vehicle");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Driving the car");
    }
}
class SportsCar extends Car {
    void accelerate() {
        System.out.println("Accelerating the sports car");
    }
}
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void work() {
        System.out.println(name + " is working");
    }
}
class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
    void manageTeam() {
        System.out.println(name + " is managing the team");
    }
}
class Developer extends Employee {
    Developer(String name) {
        super(name);
    }
    void code() {
        System.out.println(name + " is coding");
    }
}
public class _5Q2 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.start(); 
        sportsCar.drive(); 
        sportsCar.accelerate(); 
        Manager manager = new Manager("John");
        Developer developer = new Developer("Alice");
        manager.work();
        manager.manageTeam();
        developer.work();
        developer.code();
    }
    
}
