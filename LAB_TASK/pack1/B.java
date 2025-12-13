package pack1;
public class B {
    public static void main(String[] args) {
        A a = new A();
        a.defaultMethod();    // Accessing default method
        a.protectedMethod();  // Accessing protected method
        a.publicMethod();     // Accessing public method
    }
}