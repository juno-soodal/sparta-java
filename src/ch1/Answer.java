package src.ch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Answer {
    private final static double SCORE = 5;

    private final static String MISMATCH_MSG = "숫자로 입력하세요";
    public static void main(String[] args) {
//        내가 좋아하는 요리 제목을 먼저 입력합니다.
//        요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 주세요. (ex. 3.5)
//        이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
        Scanner scanner = new Scanner(System.in);

        String cookName = getCookName();

        double start = getStar();
        String[] receipt = new String[10];
        for (int i = 0; i < receipt.length; i++) {
            String rc = scanner.nextLine();
            receipt[i] = rc;
        }

        print(cookName,start, receipt);

    }

    private static double getStar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("별점:");
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(MISMATCH_MSG);
                scanner.nextLine();
            }
        }


    }

    private static String getCookName() {
        String cookName = "";
        Scanner scanner = new Scanner(System.in);
        while (cookName.isEmpty()) {
            System.out.print("요리 제목:");
            cookName = scanner.nextLine();
        }
        return cookName;
    }

    private static void print(String cookName, double start, String[] receipt) {
        System.out.println("[ " +cookName+ " ]");
        System.out.println("별점: " + start + "(" + toPercent(start)+ ")");
        for (int i = 0; i < receipt.length; i++) {
            System.out.println((i+1) + ". " + receipt[i]);
        }
    }

    private static String toPercent(double start) {
        return (start / SCORE  * 100 ) + "%";
    }
}
