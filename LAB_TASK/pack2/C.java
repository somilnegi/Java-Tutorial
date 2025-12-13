package pack2;
import pack1.A;
public class C extends A {
    public static void main(String[] args) {
        C c=new C();
        c.protectedMethod();  // Accessing protected method
        c.publicMethod();     // Accessing public method
    }
}