public class Main {
    public static void main(String[] args) {
        boolean test = 5 > 4;       // true
        boolean test1 = 'A' > 'a';    // false
        boolean test2 = 'B' + 1 < 'a';  // false
        boolean test3 = 0 == -0;    // true
        boolean test4 = true == false;  // false


        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}
