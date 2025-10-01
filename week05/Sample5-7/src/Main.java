import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char type;
        int width, height, area;

        System.out.print("가로 길이(cm)를 입력하세요: ");
        width = kb.nextInt();
        System.out.print("세로 길이(cm)를 입력하세요: ");
        height = kb.nextInt();

        type = width == height ? '정' : '직';
        area = width * height;

        System.out.printf("**** %c사각형 넓이 ******\n", type);
        System.out.printf("\t가로 길이 : %d Cm\n", width);
        System.out.printf("\t세로 길이 : %d Cm\n", height);
        System.out.printf("\t넓이 : %d Cm^2\n", area);
    }
}