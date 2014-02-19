public class AutoBoxing {

    static void go(Integer x) {
        System.out.println("Integer method");
    }

    static void go(long x) {
        System.out.println("long method");
    }

    public static void main(String[] args) {
        Integer x = 1;
        System.out.println(++x);

        Integer a = 1;
        Integer b = 1;

        System.out.println("a == b -> " + (a == b ? true : false));
        System.out.println("a != b -> " + (a != b ? true : false));

        Integer c = 3;
        Integer d = c;

        System.out.println("c == d -> " + (c == d ? true : false));
        System.out.println("c != d -> " + (c != d ? true : false));

        System.out.println("c equals d --> " + c.equals(d));

        go(5); // widening is preferred over boxing

    }
}
