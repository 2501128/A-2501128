import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int won;
        float convert;
        float dollar;

        System.out.print("오늘의 달러 환률 입력 : ");
        convert = keyboard.nextFloat();
        System.out.print("얼마를 달러로 환전할까요 ? ");
        won = keyboard.nextInt();

        dollar = won / convert;
        System.out.printf("원화 %,d원은 %.2f 달러($) 입니다.\\n", won, dollar);
    }
}
