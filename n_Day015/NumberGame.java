import java.util.Scanner;
import java.util.Random;

class NumberGame {

    static int[] arr = new int[3];

    public static void main(String[] args) {

        NumberGame n = new NumberGame();

        n.randomNumber(); // 난수 발생

        Scanner sc = new Scanner(System.in);

        while (true) {
            // printNumber();
            System.out.println("자 공격하세요.");
            int answer = sc.nextInt();

            // 입력 받은 숫자 배열에 저장하기
            String temp = Integer.toString(answer);
            int[] uArr = new int[temp.length()];

            for (int i = 0; i < temp.length(); i++) {
                uArr[i] = temp.charAt(i) - '0';
            }

            if (answer < 100 || answer > 999 || checkDuplication(uArr)) {
                System.out.println("숫자는 100이상 999이하의 겹치지 않는 숫자여야 합니다.");
            } else {
                int[] result = game(arr, uArr);
                int strike = result[0];
                int ball = result[1];

                if (strike == 3) {
                    System.out.println("홈런");
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (strike == 0 && ball == 0) {
                    System.out.println("아웃");
                } else {
                    System.out.println(strike + "스트라이크 " + ball + "볼");
                }
            }
        }
    }

    // 난수 생성 메소드
    public void randomNumber() {
        Random random = new Random();

        arr[0] = random.nextInt(9) + 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = random.nextInt(10);

            if (checkDuplication(arr)) {
                i--;
            }
        }
    }

    // 넘버 프린트 메소드
    public static void printNumber() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // 중복 숫자 체크 메소드
    public static boolean checkDuplication(int[] uArr) {
        for (int i = 0; i < uArr.length; i++) {
            for (int j = i + 1; j < uArr.length; j++) {
                if (uArr[i] == uArr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 스트라이크, 볼, 아웃 판별
    public static int[] game(int[] arr, int[] uArr) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < uArr.length; j++) {
                if (arr[i] == uArr[j] && i == j) {
                    strike++;
                } else if (arr[i] == uArr[j] && i != j) {
                    ball++;
                }
            }
        }
        return new int[]{strike, ball};
    }
}