/**
 * Interface can extend multiple Interfaces
 * All methods in an interface are implicitly public and abstract.
 * Variables in an interface are implicitly public, static and final i.e a Constant.
 */

public interface SampleInterface extends ParentInterface1, ParentInterface2 {
    String SAMPLE_INTERFACE_CONST = "sampleInterfaceConstantString";
}

interface ParentInterface1 {
    void parentInterface1Method();
}

interface ParentInterface2 {
    void parentInterface2Method();
}

/**
 * Default constructor implemented by compiler.
 * Implements interface and their methods.
 */
class SampleInterfaceImplementer implements SampleInterface {

    @Override
    public void parentInterface1Method() {
        System.out.println("Implementing Parent Interface1 method");
    }

    @Override
    public void parentInterface2Method() {
        System.out.println("Implementing Parent Interface2 method");
    }

    public static void main(String[] args) {
        SampleInterface sampleInterface = new SampleInterfaceImplementer();
        sampleInterface.parentInterface1Method();
        sampleInterface.parentInterface2Method();
        System.out.println(SAMPLE_INTERFACE_CONST);
    }
}
