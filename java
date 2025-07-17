public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;

        // Autoboxing
        Integer intObj = a;
        Double doubleObj = b;
        System.out.println("Autoboxed Integer: " + intObj);
        System.out.println("Autoboxed Double: " + doubleObj);

        // Unboxing
        int x = intObj;
        double y = doubleObj;
        System.out.println("Unboxed int: " + x);
        System.out.println("Unboxed double: " + y);
    }
}
