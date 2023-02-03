/*
1.
정의 : 프로그램 실행 중 발생할 수 있는 예외를 대비하는 코드
목적 : 프로그램 실행 중 예외가 발생했을때 비정상 종료를 막고 실행상태를 유지시키기 위해
2. d
3. d, e
4. c
5. 1
   3
   5
   1
   2
   5
   6
6. 3
   5
7. 1
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class BookTest8 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input;
        int count = 0;

        do {
            count++;
            try {
                System.out.println("1과 100사이의 값을 입력하세요.");
                input = new Scanner(System.in).nextInt();

                if (answer > input) {
                    System.out.println("더 큰 수를 입력하세요.");
                } else if (answer < input) {
                    System.out.println("더 작은 수를 입력하세요.");
                } else {
                    System.out.println(" 맞췄습니다.");
                    System.out.println("시도횟수는 " + count + "번입니다.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
            }
        } while(true);
    }
}

class BookTest9 {
    public static void main(String[] args) throws Exception{
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE = 100;

    public UnsupportedFunctionException(String message, int errorCode) {
        super(message);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + ERR_CODE + "]" + super.getMessage();
    }
}

/*
9. 2
   4
   7
 */