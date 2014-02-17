/**
 * Sample for Abstract class.
 * Shows inheritance, order of constructor calls.
 * Constructor can be created for Abstract class.
 * Sample abstract method.
 * Abstract class can be created without an abstract method.
 */

abstract class ParentAbstractClass {
    private String myVar;

    ParentAbstractClass() {
        System.out.println("Sample Abstract Class Constructor for : " + this.getClass().getCanonicalName());
    }

    private void privateMethod(){};

    public String getMyVar() {
        return myVar;
    }

    public void setMyVar(String myVar) {
        this.myVar = myVar;
    }

    public final void finalMethod() {
        System.out.println("Final method in Parent Abstract Class");
    }

    public abstract void printSomething();
}

public class AbstractClass extends ParentAbstractClass {
    public AbstractClass() {
        System.out.println("Constructor for : " + this.getClass().getCanonicalName());
    }

    public void privateMethod() {};

    public void printSomething() {
        System.out.println("Overriding abstract method");
    }

//  Cannot override final method
//  public void finalMethod();

    public static void main(String[] args) {
        ParentAbstractClass abstractClass = new AbstractClass();
        abstractClass.setMyVar("MyVar");
        System.out.println(abstractClass.getMyVar());
        abstractClass.printSomething();
        abstractClass.finalMethod();
    }
}
