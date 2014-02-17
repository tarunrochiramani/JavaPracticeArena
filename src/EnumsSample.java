enum Colors {
    GREEN("Green", 1),
    YELLOW("Yellow", 2) { //Overriding the getType() for this enumeration.
        public String getType() {
            return "B";
        }
    };

    private final String name;
    private final int value;

    Colors(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return "A";
    }

    //Overriding the toString
    public String toString() {
        return getName() + " " + getValue() + " " + getType();
    }
};

enum Shape {
    TRIANGLE
}

public class EnumsSample {
    private Colors colors_1;
    private Colors colors_2;
    private Shape shape;

    public static void main(String[] args) {
        EnumsSample enumsSample = new EnumsSample();
        enumsSample.colors_1 = Colors.GREEN;
        enumsSample.colors_2 = Colors.YELLOW;
        enumsSample.shape = Shape.TRIANGLE;

        System.out.println(enumsSample.colors_1);
        System.out.println(enumsSample.colors_2);
        System.out.println(enumsSample.shape);
    }
}
