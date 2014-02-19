public class Statics {
    static int x = 0;
    static void doSomething() {
        System.out.println("Inside Static method: " + ++x);
    }
}

class StaticsSubClass extends Statics {
    static {
        System.out.println("Executing the Static block");
    }

    static void doSomething() {
        System.out.println("Redefining static method, not overriding");
    }

    public static void main (String[] args) {
        Statics.doSomething();
        Statics.doSomething();

        Statics object = new Statics();
        object.doSomething(); //use instance to call the static method

        StaticsSubClass.doSomething();
    }
}
