import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int APPLE_PRICE = 500;
        final int PEAR_PRICE = 600;
        int apple, pear;
        int price1, price2;
        int pay;
        String result;

        System.out.printf("사과(%d 원) 구매 개수 입력 : ", APPLE_PRICE);
        apple = scan.nextInt();
        System.out.printf("배(%d 원) 구매 개수 입력 : ", PEAR_PRICE);
        pear = scan.nextInt();
        System.out.print("지불 금액 입력 : ");
        pay = scan.nextInt();

        price1 = APPLE_PRICE * apple;
        price2 = PEAR_PRICE * pear;
        result = pay >= (price1 + price2) ?
                String.format("거스름돈 : %d원", pay - (price1 + price2)) :
                String.format("금액이 %,d원 부족합니다.", (price1 + price2) - pay);

        System.out.printf("사과 %d개의 가격 : %d원\n", apple, price1);
        System.out.printf("배 %d개의 가격 : %d원\n", pear, price2);
        System.out.printf("지불 금액 : %d원\n", pay);
        System.out.println(result);
    }
}