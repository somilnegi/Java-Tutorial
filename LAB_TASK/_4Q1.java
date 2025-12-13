class Parent{
    int Pvar;
    Parent(){
        System.out.println("Parent class constructor without parameters.");
    }
    Parent(int var){
        Pvar=var;
        System.out.println("Parent class constructor with parameter. Pvar = " + Pvar);
    }
}

class Child extends Parent{
    int Cvar;
    Child(){
        super();
        System.out.println("Child class constructor without parameters.");
    }
    Child(int var){
        super(var);
        // this(); This will give error. this() and super() cannot be used together in a same constructor
        Cvar=var;
        System.out.println("Child class constructor with parameter. Cvar = " + Cvar);
    }
    Child(int var,char ch){
        this();
        Cvar=var;
        System.out.println("Child class constructor with 2 parameters. Cvar = "+ Cvar);
    }
}

public class _4Q1 {
    public static void main(String[] args){
        Child child1=new Child();
        System.out.println();
        Child child2=new Child(10);
        System.out.println();
        Child child3=new Child(30,'c');
    }
}
    
