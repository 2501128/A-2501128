public class Main {
    public static void main(String[] args) {
        int a = 5;
        boolean test = (5 > 4) && a++ != 0;
        System.out.printf("test = %b, a = %d\n", test, a);  // true,  6

        a = 5;
        test = (5 < 4) && ++a != 0;
        System.out.printf("test = %b, a = %d\n", test, a);  // false,  5

        test = (5 < 4) || ++a != 0;
        System.out.printf("test = %b, a = %d\n", test, a);  // true,  6

        test = (5 > 4) || ++a != 0;
        System.out.printf("test = %b, a = %d\n", test, a);  // true,  6
    }
}