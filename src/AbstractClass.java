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
        System.out.println("Sample Abstract Class Constructor for - " + this.getClass().getCanonicalName());
    }

    ParentAbstractClass(String myVar) {
        this.myVar = myVar;
        System.out.println("Overloaded ParentAbstract Class constructor invoked.");
    }

    public String getMyVar() {
        return myVar;
    }

    public void setMyVar(String myVar) {
        this.myVar = myVar;
    }

    public final void finalMethod() {
        System.out.println("Final method in Parent Abstract Class");
    }

    protected abstract void printSomething(); // Overridden method cannot have a more restrictive access modifier i.e the overriden method can have protected or public
}

public class AbstractClass extends ParentAbstractClass {
    public AbstractClass() {
        System.out.println("Constructor for - " + this.getClass().getCanonicalName());
    }

    public AbstractClass(String myVar) {
        super(myVar);
        System.out.println("Constructor with argument for - " + this.getClass().getCanonicalName());
    }

    public void abstractClass() {
        System.out.println("Method has same name as the class");
    }

    public void printSomething() {
        System.out.println("Overriding abstract method");
    }

//  Cannot override final method
//  public void finalMethod();

    public static void main(String[] args) {
        ParentAbstractClass abstractClassObject = new AbstractClass("blah");
        System.out.println(abstractClassObject.getMyVar());

        abstractClassObject = new AbstractClass();
        abstractClassObject.setMyVar("MyVar");
        System.out.println(abstractClassObject.getMyVar());
        ((AbstractClass)abstractClassObject).abstractClass();

        abstractClassObject.printSomething();
        abstractClassObject.finalMethod();

    }
}
