public class Main {
    public static void main(String[] args) {
        int b = 5;
        int a = 5 > 3 ? b++ : --b;
        System.out.printf("test = %d, a = %d\n", a, b); // a = 5, b = 6

        a = (5 > 3 && b > a) ? b++ : --b; // a = 6, b = 7
        System.out.printf("test = %d, a = %d\n", a, b);

        a = (5 < 3 || b > a) ? b++ : --b; // a = 7, b = 8
        System.out.printf("test = %d, a = %d\n", a, b);
    }
}