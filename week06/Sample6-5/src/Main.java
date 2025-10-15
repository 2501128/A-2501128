import java.util.Scanner;
import java.util.Locale;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        final int MACH = 340; // 초당
        float fighter;
        int result;

        System.out.printf("우리 전투기의 속도는 ? ");
        fighter = kb.nextFloat();

        result = (int) ((fighter * MACH * 365 * 24 * 60 * 60) / 1000);

        System.out.printf("1 미하는 초당 %,d m를 이동합나다.\n", MACH);
        System.out.printf("%.1f 마하의 전투기는 1년 간 거리는 %.d \u33a2 입니다.\n",
                fighter, result);
    }
}