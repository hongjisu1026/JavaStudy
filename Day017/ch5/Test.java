import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        int num = 10;
        String temp = String.valueOf(num);

        System.out.println(temp);
    }
}

class Test2 {
    public static void main(String[] args) {
        String numStr = "20";
        int temp = Integer.parseInt(numStr);
        System.out.println(temp);
    }
}

class Test3 {
    public static void main(String[] args) {
        String str = "0123456789";

        System.out.println(str.substring(3));
    }
}

class Test4 {
    public static void main(String[] args) {
        String str = "0123456789";

        System.out.println(str.substring(4, 7));
    }
}

class Test5 {
    public static void main(String[] args) {
        double num1 = 3.5;
        double num2 = 3.5;
        double num3 = 3.1;

        System.out.println("반올림 : " + Math.round(num1));
        System.out.println("내림 : " + Math.floor(num2));
        System.out.println("올림 : " + Math.ceil(num3));
    }
}

class Test8 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int j = (int) Math.floor(Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

class BaseballGame {
    static int[] arr = new int[3];

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        randomNumber(); // 난수 발생
        while (true) {
            // printNumber();
            System.out.println("자 공격하세요.");
            int answer = sc.nextInt();

            // 입력 받은 숫자 배열에 저장하기
            String temp = String.valueOf(answer);
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
    public static void randomNumber() {
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