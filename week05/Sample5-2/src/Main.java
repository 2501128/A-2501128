public class Main {
    public static void main(String[] args) {
        boolean test = ((5 > 3) && (6 < 4));    // true && false -> false
        boolean test1 = ((5 > 3) && (6 < 4));   // true && false -> false
        boolean test2 = ((5 > 3) || (6 < 4));   // true || false -> true
        boolean test3 = ((5 > 3) || (6 < 4));   // true || false -> true
        boolean test4 = ((5 > 3) && (6 < 4));   // true && false -> false
        boolean test5 = ((5 > 3) && (6 < 4));   // true && false -> false
        boolean test6 = ((5 > 3) | (6 < 4));    // true | false -> true
        boolean test7 = ((5 > 3) | (6 < 4));    // true | false -> true

        boolean test8 = (('A' + 1 > 'c') && (('b' - 1) != 'a'));   // false && false -> false
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
        System.out.println(test7);
        System.out.println(test8);
    }
}